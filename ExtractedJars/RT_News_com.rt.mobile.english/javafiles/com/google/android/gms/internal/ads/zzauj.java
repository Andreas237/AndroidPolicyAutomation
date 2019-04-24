// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaui

public final class zzauj
{

	public static zzaui zzdx(String s)
		throws GeneralSecurityException
	{
		for(Iterator iterator = zzdhj.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #16  <Field CopyOnWriteArrayList zzdhj>
	//*   1    3:invokevirtual   #25  <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #31  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            38
		{
			zzaui zzaui1 = (zzaui)iterator.next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #35  <Method Object Iterator.next()>
	//    8   22:checkcast       #37  <Class zzaui>
	//    9   25:astore_2        
			if(zzaui1.zzdv(s))
	//*  10   26:aload_2         
	//*  11   27:aload_0         
	//*  12   28:invokeinterface #41  <Method boolean zzaui.zzdv(String)>
	//*  13   33:ifeq            7
				return zzaui1;
	//   14   36:aload_2         
	//   15   37:areturn         
		}

		s = String.valueOf(((Object) (s)));
	//   16   38:aload_0         
	//   17   39:invokestatic    #47  <Method String String.valueOf(Object)>
	//   18   42:astore_0        
		if(s.length() != 0)
	//*  19   43:aload_0         
	//*  20   44:invokevirtual   #51  <Method int String.length()>
	//*  21   47:ifeq            60
			s = "No KMS client does support: ".concat(s);
	//   22   50:ldc1            #53  <String "No KMS client does support: ">
	//   23   52:aload_0         
	//   24   53:invokevirtual   #57  <Method String String.concat(String)>
	//   25   56:astore_0        
		else
	//*  26   57:goto            70
			s = new String("No KMS client does support: ");
	//   27   60:new             #43  <Class String>
	//   28   63:dup             
	//   29   64:ldc1            #53  <String "No KMS client does support: ">
	//   30   66:invokespecial   #60  <Method void String(String)>
	//   31   69:astore_0        
		throw new GeneralSecurityException(s);
	//   32   70:new             #21  <Class GeneralSecurityException>
	//   33   73:dup             
	//   34   74:aload_0         
	//   35   75:invokespecial   #61  <Method void GeneralSecurityException(String)>
	//   36   78:athrow          
	}

	private static final CopyOnWriteArrayList zzdhj = new CopyOnWriteArrayList();

	static 
	{
	//    0    0:new             #11  <Class CopyOnWriteArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void CopyOnWriteArrayList()>
	//    3    7:putstatic       #16  <Field CopyOnWriteArrayList zzdhj>
	//*   4   10:return          
	}
}
