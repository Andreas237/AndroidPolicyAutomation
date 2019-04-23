// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabd, zaaj, zabe, zaaw, 
//			zacm, zacp, zaai, zabt

public final class zaah
	implements zabd
{

	public zaah(zabe zabe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zaft = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean zaft>
		zafs = zabe1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field zabe zafs>
	//    8   14:return          
	}

	static zabe zaa(zaah zaah1)
	{
		return zaah1.zafs;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zabe zafs>
	//    2    4:areturn         
	}

	public final void begin()
	{
	//    0    0:return          
	}

	public final void connect()
	{
		if(zaft)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean zaft>
	//*   2    4:ifeq            28
		{
			zaft = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #17  <Field boolean zaft>
			zafs.zaa(((zabf) (new zaaj(this, ((zabd) (this))))));
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field zabe zafs>
	//    8   16:new             #26  <Class zaaj>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #29  <Method void zaaj(zaah, zabd)>
	//   13   25:invokevirtual   #34  <Method void zabe.zaa(zabf)>
		}
	//   14   28:return          
	}

	public final boolean disconnect()
	{
		if(zaft)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean zaft>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(zafs.zaed.zaax())
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field zabe zafs>
	//*   7   13:getfield        #40  <Field zaaw zabe.zaed>
	//*   8   16:invokevirtual   #45  <Method boolean zaaw.zaax()>
	//*   9   19:ifeq            69
		{
			zaft = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #17  <Field boolean zaft>
			for(Iterator iterator = zafs.zaed.zahd.iterator(); iterator.hasNext(); ((zacm)iterator.next()).zabv());
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field zabe zafs>
	//   15   31:getfield        #40  <Field zaaw zabe.zaed>
	//   16   34:getfield        #49  <Field Set zaaw.zahd>
	//   17   37:invokeinterface #55  <Method Iterator Set.iterator()>
	//   18   42:astore_1        
	//   19   43:aload_1         
	//   20   44:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   21   49:ifeq            67
	//   22   52:aload_1         
	//   23   53:invokeinterface #64  <Method Object Iterator.next()>
	//   24   58:checkcast       #66  <Class zacm>
	//   25   61:invokevirtual   #69  <Method void zacm.zabv()>
	//*  26   64:goto            43
			return false;
	//   27   67:iconst_0        
	//   28   68:ireturn         
		} else
		{
			zafs.zaf(((ConnectionResult) (null)));
	//   29   69:aload_0         
	//   30   70:getfield        #19  <Field zabe zafs>
	//   31   73:aconst_null     
	//   32   74:invokevirtual   #73  <Method void zabe.zaf(ConnectionResult)>
			return true;
	//   33   77:iconst_1        
	//   34   78:ireturn         
		}
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return execute(apimethodimpl);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #78  <Method BaseImplementation$ApiMethodImpl execute(BaseImplementation$ApiMethodImpl)>
	//    3    5:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		Object obj1;
		zafs.zaed.zahe.zab(((BasePendingResult) (apimethodimpl)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zabe zafs>
	//    2    4:getfield        #40  <Field zaaw zabe.zaed>
	//    3    7:getfield        #86  <Field zacp zaaw.zahe>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #92  <Method void zacp.zab(BasePendingResult)>
		zaaw zaaw1 = zafs.zaed;
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field zabe zafs>
	//    8   18:getfield        #40  <Field zaaw zabe.zaed>
	//    9   21:astore_2        
		obj1 = ((Object) (apimethodimpl.getClientKey()));
	//   10   22:aload_1         
	//   11   23:invokevirtual   #98  <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   12   26:astore_3        
		obj1 = ((Object) ((com.google.android.gms.common.api.Api.Client)zaaw1.zagy.get(obj1)));
	//   13   27:aload_2         
	//   14   28:getfield        #102 <Field Map zaaw.zagy>
	//   15   31:aload_3         
	//   16   32:invokeinterface #108 <Method Object Map.get(Object)>
	//   17   37:checkcast       #110 <Class com.google.android.gms.common.api.Api$Client>
	//   18   40:astore_3        
		Preconditions.checkNotNull(obj1, "Appropriate Api was not requested.");
	//   19   41:aload_3         
	//   20   42:ldc1            #112 <String "Appropriate Api was not requested.">
	//   21   44:invokestatic    #118 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   22   47:pop             
		if(((com.google.android.gms.common.api.Api.Client) (obj1)).isConnected() || !zafs.zaho.containsKey(((Object) (apimethodimpl.getClientKey()))))
			break MISSING_BLOCK_LABEL_91;
	//   23   48:aload_3         
	//   24   49:invokeinterface #121 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//   25   54:ifne            91
	//   26   57:aload_0         
	//   27   58:getfield        #19  <Field zabe zafs>
	//   28   61:getfield        #124 <Field Map zabe.zaho>
	//   29   64:aload_1         
	//   30   65:invokevirtual   #98  <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   31   68:invokeinterface #128 <Method boolean Map.containsKey(Object)>
	//   32   73:ifeq            91
		apimethodimpl.setFailedResult(new Status(17));
	//   33   76:aload_1         
	//   34   77:new             #130 <Class Status>
	//   35   80:dup             
	//   36   81:bipush          17
	//   37   83:invokespecial   #133 <Method void Status(int)>
	//   38   86:invokevirtual   #137 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
		return apimethodimpl;
	//   39   89:aload_1         
	//   40   90:areturn         
		DeadObjectException deadobjectexception;
		Object obj = obj1;
	//   41   91:aload_3         
	//   42   92:astore_2        
		try
		{
			if(obj1 instanceof SimpleClientAdapter)
	//*  43   93:aload_3         
	//*  44   94:instanceof      #139 <Class SimpleClientAdapter>
	//*  45   97:ifeq            108
				obj = ((Object) (((SimpleClientAdapter)obj1).getClient()));
	//   46  100:aload_3         
	//   47  101:checkcast       #139 <Class SimpleClientAdapter>
	//   48  104:invokevirtual   #143 <Method com.google.android.gms.common.api.Api$SimpleClient SimpleClientAdapter.getClient()>
	//   49  107:astore_2        
			apimethodimpl.run(((com.google.android.gms.common.api.Api.AnyClient) (obj)));
	//   50  108:aload_1         
	//   51  109:aload_2         
	//   52  110:invokevirtual   #147 <Method void BaseImplementation$ApiMethodImpl.run(com.google.android.gms.common.api.Api$AnyClient)>
		}
	//*  53  113:aload_1         
	//*  54  114:areturn         
	//*  55  115:aload_0         
	//*  56  116:getfield        #19  <Field zabe zafs>
	//*  57  119:new             #149 <Class zaai>
	//*  58  122:dup             
	//*  59  123:aload_0         
	//*  60  124:aload_0         
	//*  61  125:invokespecial   #150 <Method void zaai(zaah, zabd)>
	//*  62  128:invokevirtual   #34  <Method void zabe.zaa(zabf)>
	//*  63  131:aload_1         
	//*  64  132:areturn         
		// Misplaced declaration of an exception variable
		catch(DeadObjectException deadobjectexception)
		{
			zafs.zaa(((zabf) (new zaai(this, ((zabd) (this))))));
			return apimethodimpl;
		}
		return apimethodimpl;
	//*  65  133:astore_2        
	//*  66  134:goto            115
	}

	public final void onConnected(Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zafs.zaf(((ConnectionResult) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zabe zafs>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #73  <Method void zabe.zaf(ConnectionResult)>
		zafs.zahs.zab(i, zaft);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field zabe zafs>
	//    6   12:getfield        #158 <Field zabt zabe.zahs>
	//    7   15:iload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field boolean zaft>
	//   10   20:invokeinterface #163 <Method void zabt.zab(int, boolean)>
	//   11   25:return          
	}

	public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
	{
	//    0    0:return          
	}

	final void zaam()
	{
		if(zaft)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean zaft>
	//*   2    4:ifeq            30
		{
			zaft = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #17  <Field boolean zaft>
			zafs.zaed.zahe.release();
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field zabe zafs>
	//    8   16:getfield        #40  <Field zaaw zabe.zaed>
	//    9   19:getfield        #86  <Field zacp zaaw.zahe>
	//   10   22:invokevirtual   #169 <Method void zacp.release()>
			disconnect();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #171 <Method boolean disconnect()>
	//   13   29:pop             
		}
	//   14   30:return          
	}

	private final zabe zafs;
	private boolean zaft;
}
