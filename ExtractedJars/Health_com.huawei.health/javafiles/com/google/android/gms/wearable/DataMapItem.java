// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable:
//			DataItem, DataMap, DataItemAsset, Asset

public class DataMapItem
{

	private DataMapItem(DataItem dataitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mUri = dataitem.getUri();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #19  <Method Uri DataItem.getUri()>
	//    5   11:putfield        #21  <Field Uri mUri>
		zzbST = zza((DataItem)dataitem.freeze());
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokeinterface #25  <Method Object DataItem.freeze()>
	//   10   22:checkcast       #15  <Class DataItem>
	//   11   25:invokespecial   #29  <Method DataMap zza(DataItem)>
	//   12   28:putfield        #31  <Field DataMap zzbST>
	//   13   31:return          
	}

	public static DataMapItem fromDataItem(DataItem dataitem)
	{
		if(dataitem == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalStateException("provided dataItem is null");
	//    2    4:new             #36  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:ldc1            #38  <String "provided dataItem is null">
	//    5   10:invokespecial   #41  <Method void IllegalStateException(String)>
	//    6   13:athrow          
		else
			return new DataMapItem(dataitem);
	//    7   14:new             #2   <Class DataMapItem>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #43  <Method void DataMapItem(DataItem)>
	//   11   22:areturn         
	}

	private DataMap zza(DataItem dataitem)
	{
		if(dataitem.getData() == null && dataitem.getAssets().size() > 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #51  <Method byte[] DataItem.getData()>
	//*   2    6:ifnonnull       33
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #55  <Method Map DataItem.getAssets()>
	//*   5   15:invokeinterface #61  <Method int Map.size()>
	//*   6   20:ifle            33
			throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
	//    7   23:new             #63  <Class IllegalArgumentException>
	//    8   26:dup             
	//    9   27:ldc1            #65  <String "Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.">
	//   10   29:invokespecial   #66  <Method void IllegalArgumentException(String)>
	//   11   32:athrow          
		if(dataitem.getData() == null)
	//*  12   33:aload_1         
	//*  13   34:invokeinterface #51  <Method byte[] DataItem.getData()>
	//*  14   39:ifnonnull       50
			return new DataMap();
	//   15   42:new             #68  <Class DataMap>
	//   16   45:dup             
	//   17   46:invokespecial   #69  <Method void DataMap()>
	//   18   49:areturn         
		int i;
		int k;
		Object obj;
		DataItemAsset dataitemasset;
		try
		{
			obj = ((Object) (new ArrayList()));
	//   19   50:new             #71  <Class ArrayList>
	//   20   53:dup             
	//   21   54:invokespecial   #72  <Method void ArrayList()>
	//   22   57:astore          4
			k = dataitem.getAssets().size();
	//   23   59:aload_1         
	//   24   60:invokeinterface #55  <Method Map DataItem.getAssets()>
	//   25   65:invokeinterface #61  <Method int Map.size()>
	//   26   70:istore_3        
		}
	//*  27   71:iconst_0        
	//*  28   72:istore_2        
	//*  29   73:iload_2         
	//*  30   74:iload_3         
	//*  31   75:icmpge          182
	//*  32   78:aload_1         
	//*  33   79:invokeinterface #55  <Method Map DataItem.getAssets()>
	//*  34   84:iload_2         
	//*  35   85:invokestatic    #78  <Method String Integer.toString(int)>
	//*  36   88:invokeinterface #82  <Method Object Map.get(Object)>
	//*  37   93:checkcast       #84  <Class DataItemAsset>
	//*  38   96:astore          5
	//*  39   98:aload           5
	//*  40  100:ifnonnull       157
	//*  41  103:aload_1         
	//*  42  104:invokestatic    #90  <Method String String.valueOf(Object)>
	//*  43  107:astore          4
	//*  44  109:new             #36  <Class IllegalStateException>
	//*  45  112:dup             
	//*  46  113:new             #92  <Class StringBuilder>
	//*  47  116:dup             
	//*  48  117:aload           4
	//*  49  119:invokestatic    #90  <Method String String.valueOf(Object)>
	//*  50  122:invokevirtual   #95  <Method int String.length()>
	//*  51  125:bipush          64
	//*  52  127:iadd            
	//*  53  128:invokespecial   #98  <Method void StringBuilder(int)>
	//*  54  131:ldc1            #100 <String "Cannot find DataItemAsset referenced in data at ">
	//*  55  133:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  56  136:iload_2         
	//*  57  137:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//*  58  140:ldc1            #109 <String " for ">
	//*  59  142:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  60  145:aload           4
	//*  61  147:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//*  62  150:invokevirtual   #112 <Method String StringBuilder.toString()>
	//*  63  153:invokespecial   #41  <Method void IllegalStateException(String)>
	//*  64  156:athrow          
	//*  65  157:aload           4
	//*  66  159:aload           5
	//*  67  161:invokeinterface #115 <Method String DataItemAsset.getId()>
	//*  68  166:invokestatic    #121 <Method Asset Asset.createFromRef(String)>
	//*  69  169:invokeinterface #127 <Method boolean List.add(Object)>
	//*  70  174:pop             
	//*  71  175:iload_2         
	//*  72  176:iconst_1        
	//*  73  177:iadd            
	//*  74  178:istore_2        
	//*  75  179:goto            73
	//*  76  182:new             #129 <Class com.google.android.gms.internal.zzblc$zza>
	//*  77  185:dup             
	//*  78  186:aload_1         
	//*  79  187:invokeinterface #51  <Method byte[] DataItem.getData()>
	//*  80  192:invokestatic    #135 <Method zzbld zzbld.zzS(byte[])>
	//*  81  195:aload           4
	//*  82  197:invokespecial   #138 <Method void com.google.android.gms.internal.zzblc$zza(zzbld, List)>
	//*  83  200:invokestatic    #143 <Method DataMap zzblc.zza(com.google.android.gms.internal.zzblc$zza)>
	//*  84  203:astore          4
	//*  85  205:aload           4
	//*  86  207:areturn         
		catch(Object obj1)
	//*  87  208:astore          4
		{
			String s = String.valueOf(((Object) (dataitem.getUri())));
	//   88  210:aload_1         
	//   89  211:invokeinterface #19  <Method Uri DataItem.getUri()>
	//   90  216:invokestatic    #90  <Method String String.valueOf(Object)>
	//   91  219:astore          5
			String s1 = String.valueOf(((Object) (Base64.encodeToString(dataitem.getData(), 0))));
	//   92  221:aload_1         
	//   93  222:invokeinterface #51  <Method byte[] DataItem.getData()>
	//   94  227:iconst_0        
	//   95  228:invokestatic    #149 <Method String Base64.encodeToString(byte[], int)>
	//   96  231:invokestatic    #90  <Method String String.valueOf(Object)>
	//   97  234:astore          6
			int j = String.valueOf(((Object) (s))).length();
	//   98  236:aload           5
	//   99  238:invokestatic    #90  <Method String String.valueOf(Object)>
	//  100  241:invokevirtual   #95  <Method int String.length()>
	//  101  244:istore_2        
			Log.w("DataItem", (new StringBuilder(String.valueOf(((Object) (s1))).length() + (j + 50))).append("Unable to parse datamap from dataItem. uri=").append(s).append(", data=").append(s1).toString());
	//  102  245:ldc1            #151 <String "DataItem">
	//  103  247:new             #92  <Class StringBuilder>
	//  104  250:dup             
	//  105  251:aload           6
	//  106  253:invokestatic    #90  <Method String String.valueOf(Object)>
	//  107  256:invokevirtual   #95  <Method int String.length()>
	//  108  259:iload_2         
	//  109  260:bipush          50
	//  110  262:iadd            
	//  111  263:iadd            
	//  112  264:invokespecial   #98  <Method void StringBuilder(int)>
	//  113  267:ldc1            #153 <String "Unable to parse datamap from dataItem. uri=">
	//  114  269:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  115  272:aload           5
	//  116  274:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  117  277:ldc1            #155 <String ", data=">
	//  118  279:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  119  282:aload           6
	//  120  284:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  121  287:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  122  290:invokestatic    #161 <Method int Log.w(String, String)>
	//  123  293:pop             
			dataitem = ((DataItem) (String.valueOf(((Object) (dataitem.getUri())))));
	//  124  294:aload_1         
	//  125  295:invokeinterface #19  <Method Uri DataItem.getUri()>
	//  126  300:invokestatic    #90  <Method String String.valueOf(Object)>
	//  127  303:astore_1        
			throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (dataitem))).length() + 44)).append("Unable to parse datamap from dataItem.  uri=").append(((String) (dataitem))).toString(), ((Throwable) (obj1)));
	//  128  304:new             #36  <Class IllegalStateException>
	//  129  307:dup             
	//  130  308:new             #92  <Class StringBuilder>
	//  131  311:dup             
	//  132  312:aload_1         
	//  133  313:invokestatic    #90  <Method String String.valueOf(Object)>
	//  134  316:invokevirtual   #95  <Method int String.length()>
	//  135  319:bipush          44
	//  136  321:iadd            
	//  137  322:invokespecial   #98  <Method void StringBuilder(int)>
	//  138  325:ldc1            #163 <String "Unable to parse datamap from dataItem.  uri=">
	//  139  327:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  140  330:aload_1         
	//  141  331:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//  142  334:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  143  337:aload           4
	//  144  339:invokespecial   #166 <Method void IllegalStateException(String, Throwable)>
	//  145  342:athrow          
		}
		i = 0;
		if(i >= k)
			break; /* Loop/switch isn't completed */
		dataitemasset = (DataItemAsset)dataitem.getAssets().get(((Object) (Integer.toString(i))));
		if(dataitemasset != null)
			break MISSING_BLOCK_LABEL_157;
		obj = ((Object) (String.valueOf(((Object) (dataitem)))));
		throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 64)).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(((String) (obj))).toString());
		((List) (obj)).add(((Object) (Asset.createFromRef(dataitemasset.getId()))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_73;
_L1:
		obj = ((Object) (zzblc.zza(new com.google.android.gms.internal.zzblc.zza(zzbld.zzS(dataitem.getData()), ((List) (obj))))));
		return ((DataMap) (obj));
	}

	public DataMap getDataMap()
	{
		return zzbST;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DataMap zzbST>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Uri mUri>
	//    2    4:areturn         
	}

	private final Uri mUri;
	private final DataMap zzbST;
}
