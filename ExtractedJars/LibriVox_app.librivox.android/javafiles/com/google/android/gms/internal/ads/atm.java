// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			atu, att

final class atm
	implements atu
{

	transient atm(atu aatu[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = aatu;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field atu[] a>
	//    5    9:return          
	}

	public final boolean a(Class class1)
	{
		atu aatu[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field atu[] a>
	//    2    4:astore          4
		int j = aatu.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          39
			if(aatu[i].a(class1))
	//*  11   17:aload           4
	//*  12   19:iload_2         
	//*  13   20:aaload          
	//*  14   21:aload_1         
	//*  15   22:invokeinterface #19  <Method boolean atu.a(Class)>
	//*  16   27:ifeq            32
				return true;
	//   17   30:iconst_1        
	//   18   31:ireturn         

	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
	//*  23   36:goto            12
		return false;
	//   24   39:iconst_0        
	//   25   40:ireturn         
	}

	public final att b(Class class1)
	{
		atu aatu[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field atu[] a>
	//    2    4:astore          4
		int j = aatu.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          50
		{
			atu atu1 = aatu[i];
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:astore          5
			if(atu1.a(class1))
	//*  15   23:aload           5
	//*  16   25:aload_1         
	//*  17   26:invokeinterface #19  <Method boolean atu.a(Class)>
	//*  18   31:ifeq            43
				return atu1.b(class1);
	//   19   34:aload           5
	//   20   36:aload_1         
	//   21   37:invokeinterface #23  <Method att atu.b(Class)>
	//   22   42:areturn         
		}

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_2        
	//*  27   47:goto            12
		class1 = ((Class) (String.valueOf(((Object) (class1.getName())))));
	//   28   50:aload_1         
	//   29   51:invokevirtual   #29  <Method String Class.getName()>
	//   30   54:invokestatic    #35  <Method String String.valueOf(Object)>
	//   31   57:astore_1        
		if(((String) (class1)).length() != 0)
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #39  <Method int String.length()>
	//*  34   62:ifeq            75
			class1 = ((Class) ("No factory is available for message type: ".concat(((String) (class1)))));
	//   35   65:ldc1            #41  <String "No factory is available for message type: ">
	//   36   67:aload_1         
	//   37   68:invokevirtual   #45  <Method String String.concat(String)>
	//   38   71:astore_1        
		else
	//*  39   72:goto            85
			class1 = ((Class) (new String("No factory is available for message type: ")));
	//   40   75:new             #31  <Class String>
	//   41   78:dup             
	//   42   79:ldc1            #41  <String "No factory is available for message type: ">
	//   43   81:invokespecial   #48  <Method void String(String)>
	//   44   84:astore_1        
		throw new UnsupportedOperationException(((String) (class1)));
	//   45   85:new             #50  <Class UnsupportedOperationException>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:invokespecial   #51  <Method void UnsupportedOperationException(String)>
	//   49   93:athrow          
	}

	private atu a[];
}
