// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			zan, zal, zam

public final class zak extends AbstractSafeParcelable
{

	zak(int i, ArrayList arraylist, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #46  <Field int zale>
		zaqv = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #48  <Field ArrayList zaqv>
		HashMap hashmap = new HashMap();
	//    8   14:new             #50  <Class HashMap>
	//    9   17:dup             
	//   10   18:invokespecial   #51  <Method void HashMap()>
	//   11   21:astore          7
		int k = arraylist.size();
	//   12   23:aload_2         
	//   13   24:invokevirtual   #57  <Method int ArrayList.size()>
	//   14   27:istore          5
		for(i = 0; i < k; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_1        
	//*  17   31:iload_1         
	//*  18   32:iload           5
	//*  19   34:icmpge          140
		{
			zal zal1 = (zal)arraylist.get(i);
	//   20   37:aload_2         
	//   21   38:iload_1         
	//   22   39:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   23   42:checkcast       #63  <Class zal>
	//   24   45:astore          8
			String s1 = zal1.className;
	//   25   47:aload           8
	//   26   49:getfield        #66  <Field String zal.className>
	//   27   52:astore          9
			HashMap hashmap1 = new HashMap();
	//   28   54:new             #50  <Class HashMap>
	//   29   57:dup             
	//   30   58:invokespecial   #51  <Method void HashMap()>
	//   31   61:astore          10
			int l = zal1.zaqx.size();
	//   32   63:aload           8
	//   33   65:getfield        #69  <Field ArrayList zal.zaqx>
	//   34   68:invokevirtual   #57  <Method int ArrayList.size()>
	//   35   71:istore          6
			for(int j = 0; j < l; j++)
	//*  36   73:iconst_0        
	//*  37   74:istore          4
	//*  38   76:iload           4
	//*  39   78:iload           6
	//*  40   80:icmpge          123
			{
				zam zam1 = (zam)zal1.zaqx.get(j);
	//   41   83:aload           8
	//   42   85:getfield        #69  <Field ArrayList zal.zaqx>
	//   43   88:iload           4
	//   44   90:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   45   93:checkcast       #71  <Class zam>
	//   46   96:astore          11
				hashmap1.put(((Object) (zam1.zaqy)), ((Object) (zam1.zaqz)));
	//   47   98:aload           10
	//   48  100:aload           11
	//   49  102:getfield        #74  <Field String zam.zaqy>
	//   50  105:aload           11
	//   51  107:getfield        #78  <Field FastJsonResponse$Field zam.zaqz>
	//   52  110:invokevirtual   #82  <Method Object HashMap.put(Object, Object)>
	//   53  113:pop             
			}

	//   54  114:iload           4
	//   55  116:iconst_1        
	//   56  117:iadd            
	//   57  118:istore          4
	//*  58  120:goto            76
			hashmap.put(((Object) (s1)), ((Object) (hashmap1)));
	//   59  123:aload           7
	//   60  125:aload           9
	//   61  127:aload           10
	//   62  129:invokevirtual   #82  <Method Object HashMap.put(Object, Object)>
	//   63  132:pop             
		}

	//   64  133:iload_1         
	//   65  134:iconst_1        
	//   66  135:iadd            
	//   67  136:istore_1        
	//*  68  137:goto            31
		zaqu = hashmap;
	//   69  140:aload_0         
	//   70  141:aload           7
	//   71  143:putfield        #84  <Field HashMap zaqu>
		zaqw = (String)Preconditions.checkNotNull(((Object) (s)));
	//   72  146:aload_0         
	//   73  147:aload_3         
	//   74  148:invokestatic    #90  <Method Object Preconditions.checkNotNull(Object)>
	//   75  151:checkcast       #92  <Class String>
	//   76  154:putfield        #94  <Field String zaqw>
		zacr();
	//   77  157:aload_0         
	//   78  158:invokevirtual   #97  <Method void zacr()>
	//   79  161:return          
	}

	public zak(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #46  <Field int zale>
		zaqv = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #48  <Field ArrayList zaqv>
		zaqu = new HashMap();
	//    8   14:aload_0         
	//    9   15:new             #50  <Class HashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #51  <Method void HashMap()>
	//   12   22:putfield        #84  <Field HashMap zaqu>
		zaqw = class1.getCanonicalName();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//   16   30:putfield        #94  <Field String zaqw>
	//   17   33:return          
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #112 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = zaqu.keySet().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #84  <Field HashMap zaqu>
	//*   6   12:invokevirtual   #117 <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #123 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            137
		{
			Object obj = ((Object) ((String)iterator.next()));
	//   12   30:aload_2         
	//   13   31:invokeinterface #133 <Method Object Iterator.next()>
	//   14   36:checkcast       #92  <Class String>
	//   15   39:astore_3        
			stringbuilder.append(((String) (obj)));
	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:pop             
			stringbuilder.append(":\n");
	//   20   46:aload_1         
	//   21   47:ldc1            #139 <String ":\n">
	//   22   49:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			obj = ((Object) ((Map)zaqu.get(obj)));
	//   24   53:aload_0         
	//   25   54:getfield        #84  <Field HashMap zaqu>
	//   26   57:aload_3         
	//   27   58:invokevirtual   #141 <Method Object HashMap.get(Object)>
	//   28   61:checkcast       #143 <Class Map>
	//   29   64:astore_3        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   30   65:aload_3         
	//   31   66:invokeinterface #144 <Method Set Map.keySet()>
	//   32   71:invokeinterface #123 <Method Iterator Set.iterator()>
	//   33   76:astore          4
			while(iterator1.hasNext()) 
	//*  34   78:aload           4
	//*  35   80:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  36   85:ifeq            21
			{
				String s = (String)iterator1.next();
	//   37   88:aload           4
	//   38   90:invokeinterface #133 <Method Object Iterator.next()>
	//   39   95:checkcast       #92  <Class String>
	//   40   98:astore          5
				stringbuilder.append("  ");
	//   41  100:aload_1         
	//   42  101:ldc1            #146 <String "  ">
	//   43  103:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   44  106:pop             
				stringbuilder.append(s);
	//   45  107:aload_1         
	//   46  108:aload           5
	//   47  110:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   48  113:pop             
				stringbuilder.append(": ");
	//   49  114:aload_1         
	//   50  115:ldc1            #148 <String ": ">
	//   51  117:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   52  120:pop             
				stringbuilder.append(((Map) (obj)).get(((Object) (s))));
	//   53  121:aload_1         
	//   54  122:aload_3         
	//   55  123:aload           5
	//   56  125:invokeinterface #149 <Method Object Map.get(Object)>
	//   57  130:invokevirtual   #152 <Method StringBuilder StringBuilder.append(Object)>
	//   58  133:pop             
			}
		}

	//*  59  134:goto            78
		return stringbuilder.toString();
	//   60  137:aload_1         
	//   61  138:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   62  141:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field int zale>
	//    7   11:invokestatic    #166 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #53  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #167 <Method void ArrayList()>
	//   11   21:astore_3        
		String s;
		for(Iterator iterator = zaqu.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zal(s, (Map)zaqu.get(((Object) (s))))))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #84  <Field HashMap zaqu>
	//*  14   26:invokevirtual   #117 <Method Set HashMap.keySet()>
	//*  15   29:invokeinterface #123 <Method Iterator Set.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            87
			s = (String)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #133 <Method Object Iterator.next()>
	//   22   53:checkcast       #92  <Class String>
	//   23   56:astore          5

	//   24   58:aload_3         
	//   25   59:new             #63  <Class zal>
	//   26   62:dup             
	//   27   63:aload           5
	//   28   65:aload_0         
	//   29   66:getfield        #84  <Field HashMap zaqu>
	//   30   69:aload           5
	//   31   71:invokevirtual   #141 <Method Object HashMap.get(Object)>
	//   32   74:checkcast       #143 <Class Map>
	//   33   77:invokespecial   #170 <Method void zal(String, Map)>
	//   34   80:invokevirtual   #174 <Method boolean ArrayList.add(Object)>
	//   35   83:pop             
	//*  36   84:goto            36
		SafeParcelWriter.writeTypedList(parcel, 2, ((java.util.List) (arraylist)), false);
	//   37   87:aload_1         
	//   38   88:iconst_2        
	//   39   89:aload_3         
	//   40   90:iconst_0        
	//   41   91:invokestatic    #178 <Method void SafeParcelWriter.writeTypedList(Parcel, int, java.util.List, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zaqw, false);
	//   42   94:aload_1         
	//   43   95:iconst_3        
	//   44   96:aload_0         
	//   45   97:getfield        #94  <Field String zaqw>
	//   46  100:iconst_0        
	//   47  101:invokestatic    #182 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   48  104:aload_1         
	//   49  105:iload_2         
	//   50  106:invokestatic    #185 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   51  109:return          
	}

	public final void zaa(Class class1, Map map)
	{
		zaqu.put(((Object) (class1.getCanonicalName())), ((Object) (map)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field HashMap zaqu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #82  <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public final boolean zaa(Class class1)
	{
		return zaqu.containsKey(((Object) (class1.getCanonicalName())));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field HashMap zaqu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//    4    8:invokevirtual   #192 <Method boolean HashMap.containsKey(Object)>
	//    5   11:ireturn         
	}

	public final void zacr()
	{
		for(Iterator iterator = zaqu.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field HashMap zaqu>
	//*   2    4:invokevirtual   #117 <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #123 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            90
		{
			Object obj = ((Object) ((String)iterator.next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #133 <Method Object Iterator.next()>
	//   10   28:checkcast       #92  <Class String>
	//   11   31:astore_2        
			obj = ((Object) ((Map)zaqu.get(obj)));
	//   12   32:aload_0         
	//   13   33:getfield        #84  <Field HashMap zaqu>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #141 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #143 <Class Map>
	//   17   43:astore_2        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   18   44:aload_2         
	//   19   45:invokeinterface #144 <Method Set Map.keySet()>
	//   20   50:invokeinterface #123 <Method Iterator Set.iterator()>
	//   21   55:astore_3        
			while(iterator1.hasNext()) 
	//*  22   56:aload_3         
	//*  23   57:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  24   62:ifeq            13
				((FastJsonResponse.Field)((Map) (obj)).get(((Object) ((String)iterator1.next())))).zaa(this);
	//   25   65:aload_2         
	//   26   66:aload_3         
	//   27   67:invokeinterface #133 <Method Object Iterator.next()>
	//   28   72:checkcast       #92  <Class String>
	//   29   75:invokeinterface #149 <Method Object Map.get(Object)>
	//   30   80:checkcast       #195 <Class FastJsonResponse$Field>
	//   31   83:aload_0         
	//   32   84:invokevirtual   #198 <Method void FastJsonResponse$Field.zaa(zak)>
		}

	//*  33   87:goto            56
	//   34   90:return          
	}

	public final void zacs()
	{
		String s;
		HashMap hashmap;
		for(Iterator iterator = zaqu.keySet().iterator(); iterator.hasNext(); zaqu.put(((Object) (s)), ((Object) (hashmap))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field HashMap zaqu>
	//*   2    4:invokevirtual   #117 <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #123 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            127
		{
			s = (String)iterator.next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #133 <Method Object Iterator.next()>
	//   10   28:checkcast       #92  <Class String>
	//   11   31:astore_2        
			Map map = (Map)zaqu.get(((Object) (s)));
	//   12   32:aload_0         
	//   13   33:getfield        #84  <Field HashMap zaqu>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #141 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #143 <Class Map>
	//   17   43:astore_3        
			hashmap = new HashMap();
	//   18   44:new             #50  <Class HashMap>
	//   19   47:dup             
	//   20   48:invokespecial   #51  <Method void HashMap()>
	//   21   51:astore          4
			String s1;
			for(Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); hashmap.put(((Object) (s1)), ((Object) (((FastJsonResponse.Field)map.get(((Object) (s1)))).zacl()))))
	//*  22   53:aload_3         
	//*  23   54:invokeinterface #144 <Method Set Map.keySet()>
	//*  24   59:invokeinterface #123 <Method Iterator Set.iterator()>
	//*  25   64:astore          5
	//*  26   66:aload           5
	//*  27   68:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  28   73:ifeq            113
				s1 = (String)iterator1.next();
	//   29   76:aload           5
	//   30   78:invokeinterface #133 <Method Object Iterator.next()>
	//   31   83:checkcast       #92  <Class String>
	//   32   86:astore          6

	//   33   88:aload           4
	//   34   90:aload           6
	//   35   92:aload_3         
	//   36   93:aload           6
	//   37   95:invokeinterface #149 <Method Object Map.get(Object)>
	//   38  100:checkcast       #195 <Class FastJsonResponse$Field>
	//   39  103:invokevirtual   #203 <Method FastJsonResponse$Field FastJsonResponse$Field.zacl()>
	//   40  106:invokevirtual   #82  <Method Object HashMap.put(Object, Object)>
	//   41  109:pop             
		}

	//   42  110:goto            66
	//   43  113:aload_0         
	//   44  114:getfield        #84  <Field HashMap zaqu>
	//   45  117:aload_2         
	//   46  118:aload           4
	//   47  120:invokevirtual   #82  <Method Object HashMap.put(Object, Object)>
	//   48  123:pop             
	//*  49  124:goto            13
	//   50  127:return          
	}

	public final String zact()
	{
		return zaqw;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String zaqw>
	//    2    4:areturn         
	}

	public final Map zai(String s)
	{
		return (Map)zaqu.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field HashMap zaqu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #143 <Class Map>
	//    5   11:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zan();
	private final int zale;
	private final HashMap zaqu;
	private final ArrayList zaqv;
	private final String zaqw;

	static 
	{
	//    0    0:new             #34  <Class zan>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zan()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
