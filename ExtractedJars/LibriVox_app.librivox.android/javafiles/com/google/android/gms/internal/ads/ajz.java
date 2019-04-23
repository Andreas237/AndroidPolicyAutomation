// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aji, ajf, ajh, aiy, 
//			aka, aja

public final class ajz
{

	public ajz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static aiy a(aja aja)
	{
		Iterator iterator;
		aja = ((aja) (aji.a(aja, ((aiz) (null)))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #32  <Method ajf aji.a(aja, aiz)>
	//    3    5:astore_0        
		iterator = ((ajf) (aja)).b().iterator();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #38  <Method Collection ajf.b()>
	//    6   10:invokeinterface #44  <Method Iterator Collection.iterator()>
	//    7   15:astore_1        
_L2:
		Iterator iterator1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_80;
	//    8   16:aload_1         
	//    9   17:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            80
		iterator1 = ((Collection)iterator.next()).iterator();
	//   11   25:aload_1         
	//   12   26:invokeinterface #54  <Method Object Iterator.next()>
	//   13   31:checkcast       #40  <Class Collection>
	//   14   34:invokeinterface #44  <Method Iterator Collection.iterator()>
	//   15   39:astore_2        
_L3:
		if(!iterator1.hasNext()) goto _L2; else goto _L1
	//   16   40:aload_2         
	//   17   41:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   18   46:ifeq            16
_L1:
		if(!(((ajh)iterator1.next()).a() instanceof aiy)) goto _L4; else goto _L3
	//   19   49:aload_2         
	//   20   50:invokeinterface #54  <Method Object Iterator.next()>
	//   21   55:checkcast       #56  <Class ajh>
	//   22   58:invokevirtual   #58  <Method Object ajh.a()>
	//   23   61:instanceof      #60  <Class aiy>
	//   24   64:ifeq            70
	//*  25   67:goto            40
_L4:
		throw new GeneralSecurityException("invalid HybridEncrypt key material");
	//   26   70:new             #62  <Class GeneralSecurityException>
	//   27   73:dup             
	//   28   74:ldc1            #64  <String "invalid HybridEncrypt key material">
	//   29   76:invokespecial   #67  <Method void GeneralSecurityException(String)>
	//   30   79:athrow          
		return ((aiy) (new aka(((ajf) (aja)))));
	//   31   80:new             #69  <Class aka>
	//   32   83:dup             
	//   33   84:aload_0         
	//   34   85:invokespecial   #72  <Method void aka(ajf)>
	//   35   88:areturn         
	}

	private static final Logger a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/ajz)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class ajz>
	//    1    2:invokevirtual   #14  <Method String Class.getName()>
	//    2    5:invokestatic    #20  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #22  <Field Logger a>
	//*   4   11:return          
	}
}
