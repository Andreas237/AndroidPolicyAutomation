// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public class GoogleApiAvailabilityCache
{

	public GoogleApiAvailabilityCache()
	{
		this(((GoogleApiAvailabilityLight) (GoogleApiAvailability.getInstance())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    2    4:invokespecial   #19  <Method void GoogleApiAvailabilityCache(GoogleApiAvailabilityLight)>
	//    3    7:return          
	}

	public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleapiavailabilitylight)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zaor = new SparseIntArray();
	//    2    4:aload_0         
	//    3    5:new             #25  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void SparseIntArray()>
	//    6   12:putfield        #28  <Field SparseIntArray zaor>
		Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:pop             
		zaos = googleapiavailabilitylight;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #36  <Field GoogleApiAvailabilityLight zaos>
	//   13   25:return          
	}

	public void flush()
	{
		zaor.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseIntArray zaor>
	//    2    4:invokevirtual   #41  <Method void SparseIntArray.clear()>
	//    3    7:return          
	}

	public int getClientAvailability(Context context, com.google.android.gms.common.api.Api.Client client)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (client)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		if(!client.requiresGooglePlayServices())
	//*   6   10:aload_2         
	//*   7   11:invokeinterface #49  <Method boolean com.google.android.gms.common.api.Api$Client.requiresGooglePlayServices()>
	//*   8   16:ifne            21
			return 0;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		int l = client.getMinApkVersion();
	//   11   21:aload_2         
	//   12   22:invokeinterface #53  <Method int com.google.android.gms.common.api.Api$Client.getMinApkVersion()>
	//   13   27:istore          6
		int k = zaor.get(l, -1);
	//   14   29:aload_0         
	//   15   30:getfield        #28  <Field SparseIntArray zaor>
	//   16   33:iload           6
	//   17   35:iconst_m1       
	//   18   36:invokevirtual   #57  <Method int SparseIntArray.get(int, int)>
	//   19   39:istore          5
		if(k != -1)
	//*  20   41:iload           5
	//*  21   43:iconst_m1       
	//*  22   44:icmpeq          50
			return k;
	//   23   47:iload           5
	//   24   49:ireturn         
		int j = 0;
	//   25   50:iconst_0        
	//   26   51:istore          4
		int i;
		do
		{
			i = k;
	//   27   53:iload           5
	//   28   55:istore_3        
			if(j >= zaor.size())
				break;
	//   29   56:iload           4
	//   30   58:aload_0         
	//   31   59:getfield        #28  <Field SparseIntArray zaor>
	//   32   62:invokevirtual   #60  <Method int SparseIntArray.size()>
	//   33   65:icmpge          109
			i = zaor.keyAt(j);
	//   34   68:aload_0         
	//   35   69:getfield        #28  <Field SparseIntArray zaor>
	//   36   72:iload           4
	//   37   74:invokevirtual   #64  <Method int SparseIntArray.keyAt(int)>
	//   38   77:istore_3        
			if(i > l && zaor.get(i) == 0)
	//*  39   78:iload_3         
	//*  40   79:iload           6
	//*  41   81:icmple          100
	//*  42   84:aload_0         
	//*  43   85:getfield        #28  <Field SparseIntArray zaor>
	//*  44   88:iload_3         
	//*  45   89:invokevirtual   #66  <Method int SparseIntArray.get(int)>
	//*  46   92:ifne            100
			{
				i = 0;
	//   47   95:iconst_0        
	//   48   96:istore_3        
				break;
	//   49   97:goto            109
			}
			j++;
	//   50  100:iload           4
	//   51  102:iconst_1        
	//   52  103:iadd            
	//   53  104:istore          4
		} while(true);
	//   54  106:goto            53
		j = i;
	//   55  109:iload_3         
	//   56  110:istore          4
		if(i == -1)
	//*  57  112:iload_3         
	//*  58  113:iconst_m1       
	//*  59  114:icmpne          129
			j = zaos.isGooglePlayServicesAvailable(context, l);
	//   60  117:aload_0         
	//   61  118:getfield        #36  <Field GoogleApiAvailabilityLight zaos>
	//   62  121:aload_1         
	//   63  122:iload           6
	//   64  124:invokevirtual   #72  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//   65  127:istore          4
		zaor.put(l, j);
	//   66  129:aload_0         
	//   67  130:getfield        #28  <Field SparseIntArray zaor>
	//   68  133:iload           6
	//   69  135:iload           4
	//   70  137:invokevirtual   #76  <Method void SparseIntArray.put(int, int)>
		return j;
	//   71  140:iload           4
	//   72  142:ireturn         
	}

	private final SparseIntArray zaor;
	private GoogleApiAvailabilityLight zaos;
}
