// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzaa, zzac

public static final class zzaa$zza
{

	public String toString()
	{
		StringBuilder stringbuilder = (new StringBuilder(100)).append(zzXN.getClass().getSimpleName()).append('{');
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          100
	//    3    6:invokespecial   #41  <Method void StringBuilder(int)>
	//    4    9:aload_0         
	//    5   10:getfield        #25  <Field Object zzXN>
	//    6   13:invokevirtual   #45  <Method Class Object.getClass()>
	//    7   16:invokevirtual   #50  <Method String Class.getSimpleName()>
	//    8   19:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:bipush          123
	//   10   24:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   11   27:astore_3        
		int j = zzaEY.size();
	//   12   28:aload_0         
	//   13   29:getfield        #30  <Field List zzaEY>
	//   14   32:invokeinterface #63  <Method int List.size()>
	//   15   37:istore_2        
		for(int i = 0; i < j; i++)
	//*  16   38:iconst_0        
	//*  17   39:istore_1        
	//*  18   40:iload_1         
	//*  19   41:iload_2         
	//*  20   42:icmpge          84
		{
			stringbuilder.append((String)zzaEY.get(i));
	//   21   45:aload_3         
	//   22   46:aload_0         
	//   23   47:getfield        #30  <Field List zzaEY>
	//   24   50:iload_1         
	//   25   51:invokeinterface #67  <Method Object List.get(int)>
	//   26   56:checkcast       #69  <Class String>
	//   27   59:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			if(i < j - 1)
	//*  29   63:iload_1         
	//*  30   64:iload_2         
	//*  31   65:iconst_1        
	//*  32   66:isub            
	//*  33   67:icmpge          77
				stringbuilder.append(", ");
	//   34   70:aload_3         
	//   35   71:ldc1            #71  <String ", ">
	//   36   73:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
		}

	//   38   77:iload_1         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:istore_1        
	//*  42   81:goto            40
		return stringbuilder.append('}').toString();
	//   43   84:aload_3         
	//   44   85:bipush          125
	//   45   87:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   46   90:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   47   93:areturn         
	}

	public zzaa$zza zzg(String s, Object obj)
	{
		List list = zzaEY;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List zzaEY>
	//    2    4:astore_3        
		s = (String)zzac.zzw(((Object) (s)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #69  <Class String>
	//    6   12:astore_1        
		obj = ((Object) (String.valueOf(((Object) (String.valueOf(obj))))));
	//    7   13:aload_2         
	//    8   14:invokestatic    #79  <Method String String.valueOf(Object)>
	//    9   17:invokestatic    #79  <Method String String.valueOf(Object)>
	//   10   20:astore_2        
		list.add(((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(obj).length())).append(s).append("=").append(((String) (obj))).toString())));
	//   11   21:aload_3         
	//   12   22:new             #38  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokestatic    #79  <Method String String.valueOf(Object)>
	//   16   30:invokevirtual   #82  <Method int String.length()>
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:aload_2         
	//   20   36:invokestatic    #79  <Method String String.valueOf(Object)>
	//   21   39:invokevirtual   #82  <Method int String.length()>
	//   22   42:iadd            
	//   23   43:invokespecial   #41  <Method void StringBuilder(int)>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:ldc1            #84  <String "=">
	//   27   52:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:aload_2         
	//   29   56:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   31   62:invokeinterface #88  <Method boolean List.add(Object)>
	//   32   67:pop             
		return this;
	//   33   68:aload_0         
	//   34   69:areturn         
	}

	private final Object zzXN;
	private final List zzaEY;

	private zzaa$zza(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzXN = zzac.zzw(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object zzac.zzw(Object)>
	//    5    9:putfield        #25  <Field Object zzXN>
		zzaEY = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #27  <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #28  <Method void ArrayList()>
	//   10   20:putfield        #30  <Field List zzaEY>
	//   11   23:return          
	}

	zzaa$zza(Object obj, zzaa._cls1 _pcls1)
	{
		this(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void zzaa$zza(Object)>
	//    3    5:return          
	}
}
