// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zzblc;
import com.google.android.gms.internal.zzbxt;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//			DataMap, PutDataRequest, DataMapItem, Asset

public class PutDataMapRequest
{

	private PutDataMapRequest(PutDataRequest putdatarequest, DataMap datamap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbSU = putdatarequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field PutDataRequest zzbSU>
	//    5    9:aload_0         
	//    6   10:new             #17  <Class DataMap>
	//    7   13:dup             
	//    8   14:invokespecial   #18  <Method void DataMap()>
	//    9   17:putfield        #20  <Field DataMap zzbST>
		if(datamap != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          32
			zzbST.putAll(datamap);
	//   12   24:aload_0         
	//   13   25:getfield        #20  <Field DataMap zzbST>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #24  <Method void DataMap.putAll(DataMap)>
	//   16   32:return          
	}

	public static PutDataMapRequest create(String s)
	{
		return new PutDataMapRequest(PutDataRequest.create(s), ((DataMap) (null)));
	//    0    0:new             #2   <Class PutDataMapRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #32  <Method PutDataRequest PutDataRequest.create(String)>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #34  <Method void PutDataMapRequest(PutDataRequest, DataMap)>
	//    6   12:areturn         
	}

	public static PutDataMapRequest createFromDataMapItem(DataMapItem datamapitem)
	{
		return new PutDataMapRequest(PutDataRequest.zzy(datamapitem.getUri()), datamapitem.getDataMap());
	//    0    0:new             #2   <Class PutDataMapRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #42  <Method Uri DataMapItem.getUri()>
	//    4    8:invokestatic    #46  <Method PutDataRequest PutDataRequest.zzy(Uri)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #50  <Method DataMap DataMapItem.getDataMap()>
	//    7   15:invokespecial   #34  <Method void PutDataMapRequest(PutDataRequest, DataMap)>
	//    8   18:areturn         
	}

	public static PutDataMapRequest createWithAutoAppendedId(String s)
	{
		return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(s), ((DataMap) (null)));
	//    0    0:new             #2   <Class PutDataMapRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #53  <Method PutDataRequest PutDataRequest.createWithAutoAppendedId(String)>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #34  <Method void PutDataMapRequest(PutDataRequest, DataMap)>
	//    6   12:areturn         
	}

	public PutDataRequest asPutDataRequest()
	{
		com.google.android.gms.internal.zzblc.zza zza = zzblc.zza(zzbST);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DataMap zzbST>
	//    2    4:invokestatic    #61  <Method com.google.android.gms.internal.zzblc$zza zzblc.zza(DataMap)>
	//    3    7:astore          4
		zzbSU.setData(zzbxt.zzf(((zzbxt) (zza.zzbVs))));
	//    4    9:aload_0         
	//    5   10:getfield        #15  <Field PutDataRequest zzbSU>
	//    6   13:aload           4
	//    7   15:getfield        #67  <Field com.google.android.gms.internal.zzbld com.google.android.gms.internal.zzblc$zza.zzbVs>
	//    8   18:invokestatic    #73  <Method byte[] zzbxt.zzf(zzbxt)>
	//    9   21:invokevirtual   #77  <Method PutDataRequest PutDataRequest.setData(byte[])>
	//   10   24:pop             
		int j = zza.zzbVt.size();
	//   11   25:aload           4
	//   12   27:getfield        #81  <Field List com.google.android.gms.internal.zzblc$zza.zzbVt>
	//   13   30:invokeinterface #87  <Method int List.size()>
	//   14   35:istore_2        
		for(int i = 0; i < j; i++)
	//*  15   36:iconst_0        
	//*  16   37:istore_1        
	//*  17   38:iload_1         
	//*  18   39:iload_2         
	//*  19   40:icmpge          262
		{
			String s2 = Integer.toString(i);
	//   20   43:iload_1         
	//   21   44:invokestatic    #93  <Method String Integer.toString(int)>
	//   22   47:astore          5
			Asset asset = (Asset)zza.zzbVt.get(i);
	//   23   49:aload           4
	//   24   51:getfield        #81  <Field List com.google.android.gms.internal.zzblc$zza.zzbVt>
	//   25   54:iload_1         
	//   26   55:invokeinterface #97  <Method Object List.get(int)>
	//   27   60:checkcast       #99  <Class Asset>
	//   28   63:astore          6
			if(s2 == null)
	//*  29   65:aload           5
	//*  30   67:ifnonnull       116
			{
				String s = String.valueOf(((Object) (asset)));
	//   31   70:aload           6
	//   32   72:invokestatic    #105 <Method String String.valueOf(Object)>
	//   33   75:astore          4
				throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (s))).length() + 26)).append("asset key cannot be null: ").append(s).toString());
	//   34   77:new             #107 <Class IllegalStateException>
	//   35   80:dup             
	//   36   81:new             #109 <Class StringBuilder>
	//   37   84:dup             
	//   38   85:aload           4
	//   39   87:invokestatic    #105 <Method String String.valueOf(Object)>
	//   40   90:invokevirtual   #112 <Method int String.length()>
	//   41   93:bipush          26
	//   42   95:iadd            
	//   43   96:invokespecial   #115 <Method void StringBuilder(int)>
	//   44   99:ldc1            #117 <String "asset key cannot be null: ">
	//   45  101:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46  104:aload           4
	//   47  106:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   49  112:invokespecial   #127 <Method void IllegalStateException(String)>
	//   50  115:athrow          
			}
			if(asset == null)
	//*  51  116:aload           6
	//*  52  118:ifnonnull       169
			{
				String s1 = String.valueOf(((Object) (s2)));
	//   53  121:aload           5
	//   54  123:invokestatic    #105 <Method String String.valueOf(Object)>
	//   55  126:astore          4
				if(s1.length() != 0)
	//*  56  128:aload           4
	//*  57  130:invokevirtual   #112 <Method int String.length()>
	//*  58  133:ifeq            148
					s1 = "asset cannot be null: key=".concat(s1);
	//   59  136:ldc1            #129 <String "asset cannot be null: key=">
	//   60  138:aload           4
	//   61  140:invokevirtual   #133 <Method String String.concat(String)>
	//   62  143:astore          4
				else
	//*  63  145:goto            159
					s1 = new String("asset cannot be null: key=");
	//   64  148:new             #101 <Class String>
	//   65  151:dup             
	//   66  152:ldc1            #129 <String "asset cannot be null: key=">
	//   67  154:invokespecial   #134 <Method void String(String)>
	//   68  157:astore          4
				throw new IllegalStateException(s1);
	//   69  159:new             #107 <Class IllegalStateException>
	//   70  162:dup             
	//   71  163:aload           4
	//   72  165:invokespecial   #127 <Method void IllegalStateException(String)>
	//   73  168:athrow          
			}
			if(Log.isLoggable("DataMap", 3))
	//*  74  169:ldc1            #136 <String "DataMap">
	//*  75  171:iconst_3        
	//*  76  172:invokestatic    #142 <Method boolean Log.isLoggable(String, int)>
	//*  77  175:ifeq            243
			{
				String s3 = String.valueOf(((Object) (asset)));
	//   78  178:aload           6
	//   79  180:invokestatic    #105 <Method String String.valueOf(Object)>
	//   80  183:astore          7
				int k = String.valueOf(((Object) (s2))).length();
	//   81  185:aload           5
	//   82  187:invokestatic    #105 <Method String String.valueOf(Object)>
	//   83  190:invokevirtual   #112 <Method int String.length()>
	//   84  193:istore_3        
				Log.d("DataMap", (new StringBuilder(String.valueOf(((Object) (s3))).length() + (k + 33))).append("asPutDataRequest: adding asset: ").append(s2).append(" ").append(s3).toString());
	//   85  194:ldc1            #136 <String "DataMap">
	//   86  196:new             #109 <Class StringBuilder>
	//   87  199:dup             
	//   88  200:aload           7
	//   89  202:invokestatic    #105 <Method String String.valueOf(Object)>
	//   90  205:invokevirtual   #112 <Method int String.length()>
	//   91  208:iload_3         
	//   92  209:bipush          33
	//   93  211:iadd            
	//   94  212:iadd            
	//   95  213:invokespecial   #115 <Method void StringBuilder(int)>
	//   96  216:ldc1            #144 <String "asPutDataRequest: adding asset: ">
	//   97  218:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   98  221:aload           5
	//   99  223:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  100  226:ldc1            #146 <String " ">
	//  101  228:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  102  231:aload           7
	//  103  233:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  104  236:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  105  239:invokestatic    #150 <Method int Log.d(String, String)>
	//  106  242:pop             
			}
			zzbSU.putAsset(s2, asset);
	//  107  243:aload_0         
	//  108  244:getfield        #15  <Field PutDataRequest zzbSU>
	//  109  247:aload           5
	//  110  249:aload           6
	//  111  251:invokevirtual   #154 <Method PutDataRequest PutDataRequest.putAsset(String, Asset)>
	//  112  254:pop             
		}

	//  113  255:iload_1         
	//  114  256:iconst_1        
	//  115  257:iadd            
	//  116  258:istore_1        
	//* 117  259:goto            38
		return zzbSU;
	//  118  262:aload_0         
	//  119  263:getfield        #15  <Field PutDataRequest zzbSU>
	//  120  266:areturn         
	}

	public DataMap getDataMap()
	{
		return zzbST;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field DataMap zzbST>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return zzbSU.getUri();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PutDataRequest zzbSU>
	//    2    4:invokevirtual   #155 <Method Uri PutDataRequest.getUri()>
	//    3    7:areturn         
	}

	public boolean isUrgent()
	{
		return zzbSU.isUrgent();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PutDataRequest zzbSU>
	//    2    4:invokevirtual   #159 <Method boolean PutDataRequest.isUrgent()>
	//    3    7:ireturn         
	}

	public PutDataMapRequest setUrgent()
	{
		zzbSU.setUrgent();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PutDataRequest zzbSU>
	//    2    4:invokevirtual   #163 <Method PutDataRequest PutDataRequest.setUrgent()>
	//    3    7:pop             
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final DataMap zzbST = new DataMap();
	private final PutDataRequest zzbSU;
}
