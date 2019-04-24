// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzayy, zzayz

public class zzayx extends zza
	implements Comparable
{

	public zzayx(int i, zzayz azzayz[], String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
		zzbBy = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zzbBy>
		zzbBz = azzayz;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field zzayz[] zzbBz>
	//    8   14:aload_0         
	//    9   15:new             #37  <Class TreeMap>
	//   10   18:dup             
	//   11   19:invokespecial   #38  <Method void TreeMap()>
	//   12   22:putfield        #40  <Field Map zzbBB>
		int j = azzayz.length;
	//   13   25:aload_2         
	//   14   26:arraylength     
	//   15   27:istore          4
		for(i = 0; i < j; i++)
	//*  16   29:iconst_0        
	//*  17   30:istore_1        
	//*  18   31:iload_1         
	//*  19   32:iload           4
	//*  20   34:icmpge          66
		{
			zzayz zzayz1 = azzayz[i];
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:aaload          
	//   24   40:astore          5
			zzbBB.put(((Object) (zzayz1.name)), ((Object) (zzayz1)));
	//   25   42:aload_0         
	//   26   43:getfield        #40  <Field Map zzbBB>
	//   27   46:aload           5
	//   28   48:getfield        #46  <Field String zzayz.name>
	//   29   51:aload           5
	//   30   53:invokeinterface #52  <Method Object Map.put(Object, Object)>
	//   31   58:pop             
		}

	//   32   59:iload_1         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_1        
	//*  36   63:goto            31
		zzbBA = as;
	//   37   66:aload_0         
	//   38   67:aload_3         
	//   39   68:putfield        #54  <Field String[] zzbBA>
		if(zzbBA != null)
	//*  40   71:aload_0         
	//*  41   72:getfield        #54  <Field String[] zzbBA>
	//*  42   75:ifnull          85
			Arrays.sort(((Object []) (zzbBA)));
	//   43   78:aload_0         
	//   44   79:getfield        #54  <Field String[] zzbBA>
	//   45   82:invokestatic    #60  <Method void Arrays.sort(Object[])>
	//   46   85:return          
	}

	public int compareTo(Object obj)
	{
		return zza((zzayx)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class zzayx>
	//    3    5:invokevirtual   #66  <Method int zza(zzayx)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof zzayx))
	//*   0    0:aload_1         
	//*   1    1:ifnull          59
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class zzayx>
	//*   4    8:ifeq            59
		{
			obj = ((Object) ((zzayx)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class zzayx>
	//    7   15:astore_1        
			return zzbBy == ((zzayx) (obj)).zzbBy && zzaa.equal(((Object) (zzbBB)), ((Object) (((zzayx) (obj)).zzbBB))) && Arrays.equals(((Object []) (zzbBA)), ((Object []) (((zzayx) (obj)).zzbBA)));
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field int zzbBy>
	//   10   20:aload_1         
	//   11   21:getfield        #33  <Field int zzbBy>
	//   12   24:icmpne          57
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field Map zzbBB>
	//   15   31:aload_1         
	//   16   32:getfield        #40  <Field Map zzbBB>
	//   17   35:invokestatic    #74  <Method boolean zzaa.equal(Object, Object)>
	//   18   38:ifeq            57
	//   19   41:aload_0         
	//   20   42:getfield        #54  <Field String[] zzbBA>
	//   21   45:aload_1         
	//   22   46:getfield        #54  <Field String[] zzbBA>
	//   23   49:invokestatic    #77  <Method boolean Arrays.equals(Object[], Object[])>
	//   24   52:ifeq            57
	//   25   55:iconst_1        
	//   26   56:ireturn         
	//   27   57:iconst_0        
	//   28   58:ireturn         
		} else
		{
			return false;
	//   29   59:iconst_0        
	//   30   60:ireturn         
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("Configuration(");
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #83  <String "Configuration(">
	//    3    6:invokespecial   #86  <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(zzbBy);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #33  <Field int zzbBy>
	//    8   15:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//    9   18:pop             
		stringbuilder.append(", ");
	//   10   19:aload_3         
	//   11   20:ldc1            #92  <String ", ">
	//   12   22:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append("(");
	//   14   26:aload_3         
	//   15   27:ldc1            #97  <String "(">
	//   16   29:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		for(Iterator iterator = zzbBB.values().iterator(); iterator.hasNext(); stringbuilder.append(", "))
	//*  18   33:aload_0         
	//*  19   34:getfield        #40  <Field Map zzbBB>
	//*  20   37:invokeinterface #101 <Method Collection Map.values()>
	//*  21   42:invokeinterface #107 <Method Iterator Collection.iterator()>
	//*  22   47:astore          4
	//*  23   49:aload           4
	//*  24   51:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*  25   56:ifeq            84
			stringbuilder.append(((Object) ((zzayz)iterator.next())));
	//   26   59:aload_3         
	//   27   60:aload           4
	//   28   62:invokeinterface #117 <Method Object Iterator.next()>
	//   29   67:checkcast       #42  <Class zzayz>
	//   30   70:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   31   73:pop             

	//   32   74:aload_3         
	//   33   75:ldc1            #92  <String ", ">
	//   34   77:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   35   80:pop             
	//*  36   81:goto            49
		stringbuilder.append(")");
	//   37   84:aload_3         
	//   38   85:ldc1            #122 <String ")">
	//   39   87:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   40   90:pop             
		stringbuilder.append(", ");
	//   41   91:aload_3         
	//   42   92:ldc1            #92  <String ", ">
	//   43   94:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
		stringbuilder.append("(");
	//   45   98:aload_3         
	//   46   99:ldc1            #97  <String "(">
	//   47  101:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   48  104:pop             
		if(zzbBA != null)
	//*  49  105:aload_0         
	//*  50  106:getfield        #54  <Field String[] zzbBA>
	//*  51  109:ifnull          155
		{
			String as[] = zzbBA;
	//   52  112:aload_0         
	//   53  113:getfield        #54  <Field String[] zzbBA>
	//   54  116:astore          4
			int j = as.length;
	//   55  118:aload           4
	//   56  120:arraylength     
	//   57  121:istore_2        
			for(int i = 0; i < j; i++)
	//*  58  122:iconst_0        
	//*  59  123:istore_1        
	//*  60  124:iload_1         
	//*  61  125:iload_2         
	//*  62  126:icmpge          152
			{
				stringbuilder.append(as[i]);
	//   63  129:aload_3         
	//   64  130:aload           4
	//   65  132:iload_1         
	//   66  133:aaload          
	//   67  134:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   68  137:pop             
				stringbuilder.append(", ");
	//   69  138:aload_3         
	//   70  139:ldc1            #92  <String ", ">
	//   71  141:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   72  144:pop             
			}

	//   73  145:iload_1         
	//   74  146:iconst_1        
	//   75  147:iadd            
	//   76  148:istore_1        
		} else
	//*  77  149:goto            124
	//*  78  152:goto            162
		{
			stringbuilder.append("null");
	//   79  155:aload_3         
	//   80  156:ldc1            #124 <String "null">
	//   81  158:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   82  161:pop             
		}
		stringbuilder.append(")");
	//   83  162:aload_3         
	//   84  163:ldc1            #122 <String ")">
	//   85  165:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   86  168:pop             
		stringbuilder.append(")");
	//   87  169:aload_3         
	//   88  170:ldc1            #122 <String ")">
	//   89  172:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   90  175:pop             
		return stringbuilder.toString();
	//   91  176:aload_3         
	//   92  177:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   93  180:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzayy.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #131 <Method void com.google.android.gms.internal.zzayy.zza(zzayx, Parcel, int)>
	//    4    6:return          
	}

	public int zza(zzayx zzayx1)
	{
		return zzbBy - zzayx1.zzbBy;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzbBy>
	//    2    4:aload_1         
	//    3    5:getfield        #33  <Field int zzbBy>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzayy();
	public final String zzbBA[];
	public final Map zzbBB = new TreeMap();
	public final int zzbBy;
	public final zzayz zzbBz[];

	static 
	{
	//    0    0:new             #23  <Class zzayy>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzayy()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
