// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			anj, ank, asi, ash, 
//			aok, aji, ait

public final class aiu
{

	public static anj a(String s, String s1, String s2, int i, boolean flag)
	{
		ank ank1 = anj.f().a(s1);
	//    0    0:invokestatic    #12  <Method ank anj.f()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #17  <Method ank ank.a(String)>
	//    3    7:astore          5
		s1 = String.valueOf(((Object) (s2)));
	//    4    9:aload_2         
	//    5   10:invokestatic    #23  <Method String String.valueOf(Object)>
	//    6   13:astore_1        
		if(s1.length() != 0)
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #27  <Method int String.length()>
	//*   9   18:ifeq            31
			s1 = "type.googleapis.com/google.crypto.tink.".concat(s1);
	//   10   21:ldc1            #29  <String "type.googleapis.com/google.crypto.tink.">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #33  <Method String String.concat(String)>
	//   13   27:astore_1        
		else
	//*  14   28:goto            41
			s1 = new String("type.googleapis.com/google.crypto.tink.");
	//   15   31:new             #19  <Class String>
	//   16   34:dup             
	//   17   35:ldc1            #29  <String "type.googleapis.com/google.crypto.tink.">
	//   18   37:invokespecial   #37  <Method void String(String)>
	//   19   40:astore_1        
		return (anj)(ash)((asi) (ank1.b(s1).a(0).a(true).c(s))).f();
	//   20   41:aload           5
	//   21   43:aload_1         
	//   22   44:invokevirtual   #40  <Method ank ank.b(String)>
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #43  <Method ank ank.a(int)>
	//   25   51:iconst_1        
	//   26   52:invokevirtual   #46  <Method ank ank.a(boolean)>
	//   27   55:aload_0         
	//   28   56:invokevirtual   #49  <Method ank ank.c(String)>
	//   29   59:invokevirtual   #54  <Method atv asi.f()>
	//   30   62:checkcast       #56  <Class ash>
	//   31   65:checkcast       #8   <Class anj>
	//   32   68:areturn         
	}

	public static void a(aok aok1)
	{
		for(aok1 = ((aok) (aok1.a().iterator())); ((Iterator) (aok1)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #63  <Method List aok.a()>
	//*   2    4:invokeinterface #69  <Method Iterator List.iterator()>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            123
		{
			anj anj1 = (anj)((Iterator) (aok1)).next();
	//    7   19:aload_0         
	//    8   20:invokeinterface #79  <Method Object Iterator.next()>
	//    9   25:checkcast       #8   <Class anj>
	//   10   28:astore_1        
			if(!anj1.b().isEmpty())
	//*  11   29:aload_1         
	//*  12   30:invokevirtual   #82  <Method String anj.b()>
	//*  13   33:invokevirtual   #85  <Method boolean String.isEmpty()>
	//*  14   36:ifne            113
			{
				if(!anj1.a().isEmpty())
	//*  15   39:aload_1         
	//*  16   40:invokevirtual   #87  <Method String anj.a()>
	//*  17   43:invokevirtual   #85  <Method boolean String.isEmpty()>
	//*  18   46:ifne            103
				{
					if(!anj1.e().isEmpty())
	//*  19   49:aload_1         
	//*  20   50:invokevirtual   #90  <Method String anj.e()>
	//*  21   53:invokevirtual   #85  <Method boolean String.isEmpty()>
	//*  22   56:ifne            93
						aji.a(aji.a(anj1.e()).a(anj1.b(), anj1.a(), anj1.c()), anj1.d());
	//   23   59:aload_1         
	//   24   60:invokevirtual   #90  <Method String anj.e()>
	//   25   63:invokestatic    #95  <Method ait aji.a(String)>
	//   26   66:aload_1         
	//   27   67:invokevirtual   #82  <Method String anj.b()>
	//   28   70:aload_1         
	//   29   71:invokevirtual   #87  <Method String anj.a()>
	//   30   74:aload_1         
	//   31   75:invokevirtual   #97  <Method int anj.c()>
	//   32   78:invokeinterface #102 <Method aiz ait.a(String, String, int)>
	//   33   83:aload_1         
	//   34   84:invokevirtual   #105 <Method boolean anj.d()>
	//   35   87:invokestatic    #108 <Method void aji.a(aiz, boolean)>
					else
	//*  36   90:goto            10
						throw new GeneralSecurityException("Missing catalogue_name.");
	//   37   93:new             #110 <Class GeneralSecurityException>
	//   38   96:dup             
	//   39   97:ldc1            #112 <String "Missing catalogue_name.">
	//   40   99:invokespecial   #113 <Method void GeneralSecurityException(String)>
	//   41  102:athrow          
				} else
				{
					throw new GeneralSecurityException("Missing primitive_name.");
	//   42  103:new             #110 <Class GeneralSecurityException>
	//   43  106:dup             
	//   44  107:ldc1            #115 <String "Missing primitive_name.">
	//   45  109:invokespecial   #113 <Method void GeneralSecurityException(String)>
	//   46  112:athrow          
				}
			} else
			{
				throw new GeneralSecurityException("Missing type_url.");
	//   47  113:new             #110 <Class GeneralSecurityException>
	//   48  116:dup             
	//   49  117:ldc1            #117 <String "Missing type_url.">
	//   50  119:invokespecial   #113 <Method void GeneralSecurityException(String)>
	//   51  122:athrow          
			}
		}

	//   52  123:return          
	}
}
