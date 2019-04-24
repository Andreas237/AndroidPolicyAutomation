// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaau, zaak, zabe, zaaw

final class zaaq extends zaau
{

	public zaaq(zaak zaak1, ArrayList arraylist)
	{
		zagi = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zaak zagi>
		super(zaak1, ((zaal) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #16  <Method void zaau(zaak, zaal)>
		zago = arraylist;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #18  <Field ArrayList zago>
	//   10   16:return          
	}

	public final void zaan()
	{
		zaak.zad(zagi).zaed.zagz = zaak.zag(zagi);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zaak zagi>
	//    2    4:invokestatic    #29  <Method zabe zaak.zad(zaak)>
	//    3    7:getfield        #35  <Field zaaw zabe.zaed>
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field zaak zagi>
	//    6   14:invokestatic    #39  <Method java.util.Set zaak.zag(zaak)>
	//    7   17:putfield        #45  <Field java.util.Set zaaw.zagz>
		ArrayList arraylist = (ArrayList)zago;
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field ArrayList zago>
	//   10   24:checkcast       #47  <Class ArrayList>
	//   11   27:astore_3        
		int j = arraylist.size();
	//   12   28:aload_3         
	//   13   29:invokevirtual   #51  <Method int ArrayList.size()>
	//   14   32:istore_2        
		for(int i = 0; i < j;)
	//*  15   33:iconst_0        
	//*  16   34:istore_1        
	//*  17   35:iload_1         
	//*  18   36:iload_2         
	//*  19   37:icmpge          84
		{
			Object obj = arraylist.get(i);
	//   20   40:aload_3         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #55  <Method Object ArrayList.get(int)>
	//   23   45:astore          4
			i++;
	//   24   47:iload_1         
	//   25   48:iconst_1        
	//   26   49:iadd            
	//   27   50:istore_1        
			((com.google.android.gms.common.api.Api.Client)obj).getRemoteService(zaak.zah(zagi), zaak.zad(zagi).zaed.zagz);
	//   28   51:aload           4
	//   29   53:checkcast       #57  <Class com.google.android.gms.common.api.Api$Client>
	//   30   56:aload_0         
	//   31   57:getfield        #13  <Field zaak zagi>
	//   32   60:invokestatic    #61  <Method com.google.android.gms.common.internal.IAccountAccessor zaak.zah(zaak)>
	//   33   63:aload_0         
	//   34   64:getfield        #13  <Field zaak zagi>
	//   35   67:invokestatic    #29  <Method zabe zaak.zad(zaak)>
	//   36   70:getfield        #35  <Field zaaw zabe.zaed>
	//   37   73:getfield        #45  <Field java.util.Set zaaw.zagz>
	//   38   76:invokeinterface #65  <Method void com.google.android.gms.common.api.Api$Client.getRemoteService(com.google.android.gms.common.internal.IAccountAccessor, java.util.Set)>
		}

	//*  39   81:goto            35
	//   40   84:return          
	}

	private final zaak zagi;
	private final ArrayList zago;
}
