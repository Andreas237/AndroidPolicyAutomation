// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzam, zzan

public final class zzaq extends zzc
	implements DataItem
{

	public zzaq(DataHolder dataholder, int i, int j)
	{
		super(dataholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void zzc(DataHolder, int)>
		zzaZk = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #15  <Field int zzaZk>
	//    7   11:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUx()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method DataItem zzUx()>
	//    2    4:areturn         
	}

	public Map getAssets()
	{
		HashMap hashmap = new HashMap(zzaZk);
	//    0    0:new             #26  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field int zzaZk>
	//    4    8:invokespecial   #29  <Method void HashMap(int)>
	//    5   11:astore_2        
		for(int i = 0; i < zzaZk; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #15  <Field int zzaZk>
	//*  11   19:icmpge          69
		{
			zzam zzam1 = new zzam(zzaBi, zzaDL + i);
	//   12   22:new             #31  <Class zzam>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field DataHolder zzaBi>
	//   16   30:aload_0         
	//   17   31:getfield        #38  <Field int zzaDL>
	//   18   34:iload_1         
	//   19   35:iadd            
	//   20   36:invokespecial   #39  <Method void zzam(DataHolder, int)>
	//   21   39:astore_3        
			if(zzam1.getDataItemKey() != null)
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #43  <Method String zzam.getDataItemKey()>
	//*  24   44:ifnonnull       50
	//*  25   47:goto            62
				((Map) (hashmap)).put(((Object) (zzam1.getDataItemKey())), ((Object) (zzam1)));
	//   26   50:aload_2         
	//   27   51:aload_3         
	//   28   52:invokevirtual   #43  <Method String zzam.getDataItemKey()>
	//   29   55:aload_3         
	//   30   56:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   31   61:pop             
		}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            14
		return ((Map) (hashmap));
	//   37   69:aload_2         
	//   38   70:areturn         
	}

	public byte[] getData()
	{
		return getByteArray("data");
	//    0    0:aload_0         
	//    1    1:ldc1            #55  <String "data">
	//    2    3:invokevirtual   #59  <Method byte[] getByteArray(String)>
	//    3    6:areturn         
	}

	public Uri getUri()
	{
		return Uri.parse(getString("path"));
	//    0    0:aload_0         
	//    1    1:ldc1            #63  <String "path">
	//    2    3:invokevirtual   #67  <Method String getString(String)>
	//    3    6:invokestatic    #73  <Method Uri Uri.parse(String)>
	//    4    9:areturn         
	}

	public DataItem setData(byte abyte0[])
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #77  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public String toString()
	{
		return toString(Log.isLoggable("DataItem", 3));
	//    0    0:aload_0         
	//    1    1:ldc1            #83  <String "DataItem">
	//    2    3:iconst_3        
	//    3    4:invokestatic    #89  <Method boolean Log.isLoggable(String, int)>
	//    4    7:invokevirtual   #92  <Method String toString(boolean)>
	//    5   10:areturn         
	}

	public String toString(boolean flag)
	{
		Object obj = ((Object) (getData()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method byte[] getData()>
	//    2    4:astore          4
		Object obj1 = ((Object) (getAssets()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #96  <Method Map getAssets()>
	//    5   10:astore          6
		StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
	//    6   12:new             #98  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:ldc1            #100 <String "DataItemInternal{ ">
	//    9   18:invokespecial   #103 <Method void StringBuilder(String)>
	//   10   21:astore          5
		String s1 = String.valueOf(((Object) (getUri())));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #105 <Method Uri getUri()>
	//   13   27:invokestatic    #111 <Method String String.valueOf(Object)>
	//   14   30:astore          7
		stringbuilder.append((new StringBuilder(String.valueOf(((Object) (s1))).length() + 4)).append("uri=").append(s1).toString());
	//   15   32:aload           5
	//   16   34:new             #98  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:aload           7
	//   19   40:invokestatic    #111 <Method String String.valueOf(Object)>
	//   20   43:invokevirtual   #115 <Method int String.length()>
	//   21   46:iconst_4        
	//   22   47:iadd            
	//   23   48:invokespecial   #116 <Method void StringBuilder(int)>
	//   24   51:ldc1            #118 <String "uri=">
	//   25   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:aload           7
	//   27   58:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   29   64:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
		if(obj == null)
	//*  31   68:aload           4
	//*  32   70:ifnonnull       80
			obj = "null";
	//   33   73:ldc1            #126 <String "null">
	//   34   75:astore          4
		else
	//*  35   77:goto            88
			obj = ((Object) (Integer.valueOf(obj.length)));
	//   36   80:aload           4
	//   37   82:arraylength     
	//   38   83:invokestatic    #131 <Method Integer Integer.valueOf(int)>
	//   39   86:astore          4
		obj = ((Object) (String.valueOf(obj)));
	//   40   88:aload           4
	//   41   90:invokestatic    #111 <Method String String.valueOf(Object)>
	//   42   93:astore          4
		stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 9)).append(", dataSz=").append(((String) (obj))).toString());
	//   43   95:aload           5
	//   44   97:new             #98  <Class StringBuilder>
	//   45  100:dup             
	//   46  101:aload           4
	//   47  103:invokestatic    #111 <Method String String.valueOf(Object)>
	//   48  106:invokevirtual   #115 <Method int String.length()>
	//   49  109:bipush          9
	//   50  111:iadd            
	//   51  112:invokespecial   #116 <Method void StringBuilder(int)>
	//   52  115:ldc1            #133 <String ", dataSz=">
	//   53  117:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:aload           4
	//   55  122:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   56  125:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   57  128:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   58  131:pop             
		int i = ((Map) (obj1)).size();
	//   59  132:aload           6
	//   60  134:invokeinterface #136 <Method int Map.size()>
	//   61  139:istore_2        
		stringbuilder.append((new StringBuilder(23)).append(", numAssets=").append(i).toString());
	//   62  140:aload           5
	//   63  142:new             #98  <Class StringBuilder>
	//   64  145:dup             
	//   65  146:bipush          23
	//   66  148:invokespecial   #116 <Method void StringBuilder(int)>
	//   67  151:ldc1            #138 <String ", numAssets=">
	//   68  153:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   69  156:iload_2         
	//   70  157:invokevirtual   #141 <Method StringBuilder StringBuilder.append(int)>
	//   71  160:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   72  163:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   73  166:pop             
		if(flag && !((Map) (obj1)).isEmpty())
	//*  74  167:iload_1         
	//*  75  168:ifeq            344
	//*  76  171:aload           6
	//*  77  173:invokeinterface #145 <Method boolean Map.isEmpty()>
	//*  78  178:ifne            344
		{
			stringbuilder.append(", assets=[");
	//   79  181:aload           5
	//   80  183:ldc1            #147 <String ", assets=[">
	//   81  185:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   82  188:pop             
			String s = "";
	//   83  189:ldc1            #149 <String "">
	//   84  191:astore          4
			for(obj1 = ((Object) (((Map) (obj1)).entrySet().iterator())); ((Iterator) (obj1)).hasNext();)
	//*  85  193:aload           6
	//*  86  195:invokeinterface #153 <Method Set Map.entrySet()>
	//*  87  200:invokeinterface #159 <Method Iterator Set.iterator()>
	//*  88  205:astore          6
	//*  89  207:aload           6
	//*  90  209:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  91  214:ifeq            336
			{
				Object obj2 = ((Object) ((java.util.Map.Entry)((Iterator) (obj1)).next()));
	//   92  217:aload           6
	//   93  219:invokeinterface #167 <Method Object Iterator.next()>
	//   94  224:checkcast       #169 <Class java.util.Map$Entry>
	//   95  227:astore          8
				String s2 = (String)((java.util.Map.Entry) (obj2)).getKey();
	//   96  229:aload           8
	//   97  231:invokeinterface #172 <Method Object java.util.Map$Entry.getKey()>
	//   98  236:checkcast       #107 <Class String>
	//   99  239:astore          7
				obj2 = ((Object) (String.valueOf(((Object) (((DataItemAsset)((java.util.Map.Entry) (obj2)).getValue()).getId())))));
	//  100  241:aload           8
	//  101  243:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
	//  102  248:checkcast       #177 <Class DataItemAsset>
	//  103  251:invokeinterface #180 <Method String DataItemAsset.getId()>
	//  104  256:invokestatic    #111 <Method String String.valueOf(Object)>
	//  105  259:astore          8
				int j = String.valueOf(((Object) (s))).length();
	//  106  261:aload           4
	//  107  263:invokestatic    #111 <Method String String.valueOf(Object)>
	//  108  266:invokevirtual   #115 <Method int String.length()>
	//  109  269:istore_2        
				int k = String.valueOf(((Object) (s2))).length();
	//  110  270:aload           7
	//  111  272:invokestatic    #111 <Method String String.valueOf(Object)>
	//  112  275:invokevirtual   #115 <Method int String.length()>
	//  113  278:istore_3        
				stringbuilder.append((new StringBuilder(String.valueOf(obj2).length() + (j + 2 + k))).append(s).append(s2).append(": ").append(((String) (obj2))).toString());
	//  114  279:aload           5
	//  115  281:new             #98  <Class StringBuilder>
	//  116  284:dup             
	//  117  285:aload           8
	//  118  287:invokestatic    #111 <Method String String.valueOf(Object)>
	//  119  290:invokevirtual   #115 <Method int String.length()>
	//  120  293:iload_2         
	//  121  294:iconst_2        
	//  122  295:iadd            
	//  123  296:iload_3         
	//  124  297:iadd            
	//  125  298:iadd            
	//  126  299:invokespecial   #116 <Method void StringBuilder(int)>
	//  127  302:aload           4
	//  128  304:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  129  307:aload           7
	//  130  309:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  131  312:ldc1            #182 <String ": ">
	//  132  314:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  133  317:aload           8
	//  134  319:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  135  322:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  136  325:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  137  328:pop             
				s = ", ";
	//  138  329:ldc1            #184 <String ", ">
	//  139  331:astore          4
			}

	//* 140  333:goto            207
			stringbuilder.append("]");
	//  141  336:aload           5
	//  142  338:ldc1            #186 <String "]">
	//  143  340:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  144  343:pop             
		}
		stringbuilder.append(" }");
	//  145  344:aload           5
	//  146  346:ldc1            #188 <String " }">
	//  147  348:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  148  351:pop             
		return stringbuilder.toString();
	//  149  352:aload           5
	//  150  354:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  151  357:areturn         
	}

	public DataItem zzUx()
	{
		return ((DataItem) (new zzan(((DataItem) (this)))));
	//    0    0:new             #190 <Class zzan>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #193 <Method void zzan(DataItem)>
	//    4    8:areturn         
	}

	private final int zzaZk;
}
