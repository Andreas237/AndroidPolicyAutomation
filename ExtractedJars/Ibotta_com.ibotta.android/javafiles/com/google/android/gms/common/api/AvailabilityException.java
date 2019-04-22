// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api:
//			GoogleApi

public class AvailabilityException extends Exception
{

	public AvailabilityException(ArrayMap arraymap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
		zzcc = arraymap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field ArrayMap zzcc>
	//    5    9:return          
	}

	public ConnectionResult getConnectionResult(GoogleApi googleapi)
	{
		googleapi = ((GoogleApi) (googleapi.zzm()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method zzh GoogleApi.zzm()>
	//    2    4:astore_1        
		boolean flag;
		if(zzcc.get(((Object) (googleapi))) != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #14  <Field ArrayMap zzcc>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #31  <Method Object ArrayMap.get(Object)>
	//*   7   13:ifnull          21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		Preconditions.checkArgument(flag, "The given API was not part of the availability request.");
	//   13   23:iload_2         
	//   14   24:ldc1            #33  <String "The given API was not part of the availability request.">
	//   15   26:invokestatic    #39  <Method void Preconditions.checkArgument(boolean, Object)>
		return (ConnectionResult)zzcc.get(((Object) (googleapi)));
	//   16   29:aload_0         
	//   17   30:getfield        #14  <Field ArrayMap zzcc>
	//   18   33:aload_1         
	//   19   34:invokevirtual   #31  <Method Object ArrayMap.get(Object)>
	//   20   37:checkcast       #41  <Class ConnectionResult>
	//   21   40:areturn         
	}

	public String getMessage()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #46  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void ArrayList()>
	//    3    7:astore_3        
		Object obj = ((Object) (zzcc.keySet().iterator()));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field ArrayMap zzcc>
	//    6   12:invokevirtual   #51  <Method Set ArrayMap.keySet()>
	//    7   15:invokeinterface #57  <Method Iterator Set.iterator()>
	//    8   20:astore_2        
		boolean flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		StringBuilder stringbuilder1;
		for(; ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (stringbuilder1.toString()))))
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            148
		{
			Object obj1 = ((Object) ((zzh)((Iterator) (obj)).next()));
	//   14   32:aload_2         
	//   15   33:invokeinterface #67  <Method Object Iterator.next()>
	//   16   38:checkcast       #69  <Class zzh>
	//   17   41:astore          4
			Object obj2 = ((Object) ((ConnectionResult)zzcc.get(obj1)));
	//   18   43:aload_0         
	//   19   44:getfield        #14  <Field ArrayMap zzcc>
	//   20   47:aload           4
	//   21   49:invokevirtual   #31  <Method Object ArrayMap.get(Object)>
	//   22   52:checkcast       #41  <Class ConnectionResult>
	//   23   55:astore          5
			if(((ConnectionResult) (obj2)).isSuccess())
	//*  24   57:aload           5
	//*  25   59:invokevirtual   #72  <Method boolean ConnectionResult.isSuccess()>
	//*  26   62:ifeq            67
				flag = false;
	//   27   65:iconst_0        
	//   28   66:istore_1        
			obj1 = ((Object) (((zzh) (obj1)).zzq()));
	//   29   67:aload           4
	//   30   69:invokevirtual   #75  <Method String zzh.zzq()>
	//   31   72:astore          4
			obj2 = ((Object) (String.valueOf(obj2)));
	//   32   74:aload           5
	//   33   76:invokestatic    #81  <Method String String.valueOf(Object)>
	//   34   79:astore          5
			stringbuilder1 = new StringBuilder(String.valueOf(obj1).length() + 2 + String.valueOf(obj2).length());
	//   35   81:new             #83  <Class StringBuilder>
	//   36   84:dup             
	//   37   85:aload           4
	//   38   87:invokestatic    #81  <Method String String.valueOf(Object)>
	//   39   90:invokevirtual   #87  <Method int String.length()>
	//   40   93:iconst_2        
	//   41   94:iadd            
	//   42   95:aload           5
	//   43   97:invokestatic    #81  <Method String String.valueOf(Object)>
	//   44  100:invokevirtual   #87  <Method int String.length()>
	//   45  103:iadd            
	//   46  104:invokespecial   #90  <Method void StringBuilder(int)>
	//   47  107:astore          6
			stringbuilder1.append(((String) (obj1)));
	//   48  109:aload           6
	//   49  111:aload           4
	//   50  113:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   51  116:pop             
			stringbuilder1.append(": ");
	//   52  117:aload           6
	//   53  119:ldc1            #96  <String ": ">
	//   54  121:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   55  124:pop             
			stringbuilder1.append(((String) (obj2)));
	//   56  125:aload           6
	//   57  127:aload           5
	//   58  129:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   59  132:pop             
		}

	//   60  133:aload_3         
	//   61  134:aload           6
	//   62  136:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   63  139:invokeinterface #105 <Method boolean List.add(Object)>
	//   64  144:pop             
	//*  65  145:goto            23
		StringBuilder stringbuilder = new StringBuilder();
	//   66  148:new             #83  <Class StringBuilder>
	//   67  151:dup             
	//   68  152:invokespecial   #106 <Method void StringBuilder()>
	//   69  155:astore          4
		if(flag)
	//*  70  157:iload_1         
	//*  71  158:ifeq            167
			obj = "None of the queried APIs are available. ";
	//   72  161:ldc1            #108 <String "None of the queried APIs are available. ">
	//   73  163:astore_2        
		else
	//*  74  164:goto            170
			obj = "Some of the queried APIs are unavailable. ";
	//   75  167:ldc1            #110 <String "Some of the queried APIs are unavailable. ">
	//   76  169:astore_2        
		stringbuilder.append(((String) (obj)));
	//   77  170:aload           4
	//   78  172:aload_2         
	//   79  173:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   80  176:pop             
		stringbuilder.append(TextUtils.join("; ", ((Iterable) (arraylist))));
	//   81  177:aload           4
	//   82  179:ldc1            #112 <String "; ">
	//   83  181:aload_3         
	//   84  182:invokestatic    #118 <Method String TextUtils.join(CharSequence, Iterable)>
	//   85  185:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   86  188:pop             
		return stringbuilder.toString();
	//   87  189:aload           4
	//   88  191:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   89  194:areturn         
	}

	public final ArrayMap zzl()
	{
		return zzcc;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ArrayMap zzcc>
	//    2    4:areturn         
	}

	private final ArrayMap zzcc;
}
