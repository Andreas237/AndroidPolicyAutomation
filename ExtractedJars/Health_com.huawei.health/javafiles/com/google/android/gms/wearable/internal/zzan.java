// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.*;

public class zzan
	implements DataItem
{

	public zzan(DataItem dataitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mUri = dataitem.getUri();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #22  <Method Uri DataItem.getUri()>
	//    5   11:putfield        #24  <Field Uri mUri>
		zzbeL = dataitem.getData();
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #28  <Method byte[] DataItem.getData()>
	//    9   21:putfield        #30  <Field byte[] zzbeL>
		HashMap hashmap = new HashMap();
	//   10   24:new             #32  <Class HashMap>
	//   11   27:dup             
	//   12   28:invokespecial   #33  <Method void HashMap()>
	//   13   31:astore_2        
		dataitem = ((DataItem) (dataitem.getAssets().entrySet().iterator()));
	//   14   32:aload_1         
	//   15   33:invokeinterface #37  <Method Map DataItem.getAssets()>
	//   16   38:invokeinterface #43  <Method Set Map.entrySet()>
	//   17   43:invokeinterface #49  <Method Iterator Set.iterator()>
	//   18   48:astore_1        
		do
		{
			if(!((Iterator) (dataitem)).hasNext())
				break;
	//   19   49:aload_1         
	//   20   50:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   21   55:ifeq            114
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (dataitem)).next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #59  <Method Object Iterator.next()>
	//   24   64:checkcast       #61  <Class java.util.Map$Entry>
	//   25   67:astore_3        
			if(entry.getKey() != null)
	//*  26   68:aload_3         
	//*  27   69:invokeinterface #64  <Method Object java.util.Map$Entry.getKey()>
	//*  28   74:ifnonnull       80
	//*  29   77:goto            49
				hashmap.put(((Object) ((String)entry.getKey())), ((Object) ((DataItemAsset)((DataItemAsset)entry.getValue()).freeze())));
	//   30   80:aload_2         
	//   31   81:aload_3         
	//   32   82:invokeinterface #64  <Method Object java.util.Map$Entry.getKey()>
	//   33   87:checkcast       #66  <Class String>
	//   34   90:aload_3         
	//   35   91:invokeinterface #69  <Method Object java.util.Map$Entry.getValue()>
	//   36   96:checkcast       #71  <Class DataItemAsset>
	//   37   99:invokeinterface #74  <Method Object DataItemAsset.freeze()>
	//   38  104:checkcast       #71  <Class DataItemAsset>
	//   39  107:invokevirtual   #78  <Method Object HashMap.put(Object, Object)>
	//   40  110:pop             
		} while(true);
	//   41  111:goto            49
		zzbUr = Collections.unmodifiableMap(((Map) (hashmap)));
	//   42  114:aload_0         
	//   43  115:aload_2         
	//   44  116:invokestatic    #84  <Method Map Collections.unmodifiableMap(Map)>
	//   45  119:putfield        #86  <Field Map zzbUr>
	//   46  122:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUx()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method DataItem zzUx()>
	//    2    4:areturn         
	}

	public Map getAssets()
	{
		return zzbUr;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Map zzbUr>
	//    2    4:areturn         
	}

	public byte[] getData()
	{
		return zzbeL;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field byte[] zzbeL>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Uri mUri>
	//    2    4:areturn         
	}

	public boolean isDataValid()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public DataItem setData(byte abyte0[])
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #98  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public String toString()
	{
		return toString(Log.isLoggable("DataItem", 3));
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "DataItem">
	//    2    3:iconst_3        
	//    3    4:invokestatic    #109 <Method boolean Log.isLoggable(String, int)>
	//    4    7:invokevirtual   #112 <Method String toString(boolean)>
	//    5   10:areturn         
	}

	public String toString(boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder("DataItemEntity{ ");
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #116 <String "DataItemEntity{ ">
	//    3    6:invokespecial   #119 <Method void StringBuilder(String)>
	//    4    9:astore          5
		Object obj = ((Object) (String.valueOf(((Object) (mUri)))));
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field Uri mUri>
	//    7   15:invokestatic    #123 <Method String String.valueOf(Object)>
	//    8   18:astore          4
		stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 4)).append("uri=").append(((String) (obj))).toString());
	//    9   20:aload           5
	//   10   22:new             #114 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:aload           4
	//   13   28:invokestatic    #123 <Method String String.valueOf(Object)>
	//   14   31:invokevirtual   #127 <Method int String.length()>
	//   15   34:iconst_4        
	//   16   35:iadd            
	//   17   36:invokespecial   #130 <Method void StringBuilder(int)>
	//   18   39:ldc1            #132 <String "uri=">
	//   19   41:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:aload           4
	//   21   46:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   23   52:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   24   55:pop             
		if(zzbeL == null)
	//*  25   56:aload_0         
	//*  26   57:getfield        #30  <Field byte[] zzbeL>
	//*  27   60:ifnonnull       70
			obj = "null";
	//   28   63:ldc1            #140 <String "null">
	//   29   65:astore          4
		else
	//*  30   67:goto            80
			obj = ((Object) (Integer.valueOf(zzbeL.length)));
	//   31   70:aload_0         
	//   32   71:getfield        #30  <Field byte[] zzbeL>
	//   33   74:arraylength     
	//   34   75:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//   35   78:astore          4
		obj = ((Object) (String.valueOf(obj)));
	//   36   80:aload           4
	//   37   82:invokestatic    #123 <Method String String.valueOf(Object)>
	//   38   85:astore          4
		stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 9)).append(", dataSz=").append(((String) (obj))).toString());
	//   39   87:aload           5
	//   40   89:new             #114 <Class StringBuilder>
	//   41   92:dup             
	//   42   93:aload           4
	//   43   95:invokestatic    #123 <Method String String.valueOf(Object)>
	//   44   98:invokevirtual   #127 <Method int String.length()>
	//   45  101:bipush          9
	//   46  103:iadd            
	//   47  104:invokespecial   #130 <Method void StringBuilder(int)>
	//   48  107:ldc1            #147 <String ", dataSz=">
	//   49  109:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   50  112:aload           4
	//   51  114:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   52  117:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   53  120:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   54  123:pop             
		int i = zzbUr.size();
	//   55  124:aload_0         
	//   56  125:getfield        #86  <Field Map zzbUr>
	//   57  128:invokeinterface #150 <Method int Map.size()>
	//   58  133:istore_2        
		stringbuilder.append((new StringBuilder(23)).append(", numAssets=").append(i).toString());
	//   59  134:aload           5
	//   60  136:new             #114 <Class StringBuilder>
	//   61  139:dup             
	//   62  140:bipush          23
	//   63  142:invokespecial   #130 <Method void StringBuilder(int)>
	//   64  145:ldc1            #152 <String ", numAssets=">
	//   65  147:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   66  150:iload_2         
	//   67  151:invokevirtual   #155 <Method StringBuilder StringBuilder.append(int)>
	//   68  154:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   69  157:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   70  160:pop             
		if(flag && !zzbUr.isEmpty())
	//*  71  161:iload_1         
	//*  72  162:ifeq            342
	//*  73  165:aload_0         
	//*  74  166:getfield        #86  <Field Map zzbUr>
	//*  75  169:invokeinterface #158 <Method boolean Map.isEmpty()>
	//*  76  174:ifne            342
		{
			stringbuilder.append(", assets=[");
	//   77  177:aload           5
	//   78  179:ldc1            #160 <String ", assets=[">
	//   79  181:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   80  184:pop             
			String s = "";
	//   81  185:ldc1            #162 <String "">
	//   82  187:astore          4
			for(Iterator iterator = zzbUr.entrySet().iterator(); iterator.hasNext();)
	//*  83  189:aload_0         
	//*  84  190:getfield        #86  <Field Map zzbUr>
	//*  85  193:invokeinterface #43  <Method Set Map.entrySet()>
	//*  86  198:invokeinterface #49  <Method Iterator Set.iterator()>
	//*  87  203:astore          6
	//*  88  205:aload           6
	//*  89  207:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  90  212:ifeq            334
			{
				Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   91  215:aload           6
	//   92  217:invokeinterface #59  <Method Object Iterator.next()>
	//   93  222:checkcast       #61  <Class java.util.Map$Entry>
	//   94  225:astore          8
				String s1 = (String)((java.util.Map.Entry) (obj1)).getKey();
	//   95  227:aload           8
	//   96  229:invokeinterface #64  <Method Object java.util.Map$Entry.getKey()>
	//   97  234:checkcast       #66  <Class String>
	//   98  237:astore          7
				obj1 = ((Object) (String.valueOf(((Object) (((DataItemAsset)((java.util.Map.Entry) (obj1)).getValue()).getId())))));
	//   99  239:aload           8
	//  100  241:invokeinterface #69  <Method Object java.util.Map$Entry.getValue()>
	//  101  246:checkcast       #71  <Class DataItemAsset>
	//  102  249:invokeinterface #165 <Method String DataItemAsset.getId()>
	//  103  254:invokestatic    #123 <Method String String.valueOf(Object)>
	//  104  257:astore          8
				int j = String.valueOf(((Object) (s))).length();
	//  105  259:aload           4
	//  106  261:invokestatic    #123 <Method String String.valueOf(Object)>
	//  107  264:invokevirtual   #127 <Method int String.length()>
	//  108  267:istore_2        
				int k = String.valueOf(((Object) (s1))).length();
	//  109  268:aload           7
	//  110  270:invokestatic    #123 <Method String String.valueOf(Object)>
	//  111  273:invokevirtual   #127 <Method int String.length()>
	//  112  276:istore_3        
				stringbuilder.append((new StringBuilder(String.valueOf(obj1).length() + (j + 2 + k))).append(s).append(s1).append(": ").append(((String) (obj1))).toString());
	//  113  277:aload           5
	//  114  279:new             #114 <Class StringBuilder>
	//  115  282:dup             
	//  116  283:aload           8
	//  117  285:invokestatic    #123 <Method String String.valueOf(Object)>
	//  118  288:invokevirtual   #127 <Method int String.length()>
	//  119  291:iload_2         
	//  120  292:iconst_2        
	//  121  293:iadd            
	//  122  294:iload_3         
	//  123  295:iadd            
	//  124  296:iadd            
	//  125  297:invokespecial   #130 <Method void StringBuilder(int)>
	//  126  300:aload           4
	//  127  302:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  128  305:aload           7
	//  129  307:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  130  310:ldc1            #167 <String ": ">
	//  131  312:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  132  315:aload           8
	//  133  317:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  134  320:invokevirtual   #138 <Method String StringBuilder.toString()>
	//  135  323:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  136  326:pop             
				s = ", ";
	//  137  327:ldc1            #169 <String ", ">
	//  138  329:astore          4
			}

	//* 139  331:goto            205
			stringbuilder.append("]");
	//  140  334:aload           5
	//  141  336:ldc1            #171 <String "]">
	//  142  338:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  143  341:pop             
		}
		stringbuilder.append(" }");
	//  144  342:aload           5
	//  145  344:ldc1            #173 <String " }">
	//  146  346:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  147  349:pop             
		return stringbuilder.toString();
	//  148  350:aload           5
	//  149  352:invokevirtual   #138 <Method String StringBuilder.toString()>
	//  150  355:areturn         
	}

	public DataItem zzUx()
	{
		return ((DataItem) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private Uri mUri;
	private Map zzbUr;
	private byte zzbeL[];
}
