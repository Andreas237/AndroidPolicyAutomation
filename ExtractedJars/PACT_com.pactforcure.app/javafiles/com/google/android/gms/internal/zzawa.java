// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzawb, zzawc

public class zzawa extends zza
	implements Comparable
{

	zzawa(int i, int j, zzawc azzawc[], String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field int mVersionCode>
		zzbzp = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field int zzbzp>
		zzbzq = azzawc;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field zzawc[] zzbzq>
	//   11   19:aload_0         
	//   12   20:new             #40  <Class TreeMap>
	//   13   23:dup             
	//   14   24:invokespecial   #41  <Method void TreeMap()>
	//   15   27:putfield        #43  <Field Map zzbzs>
		j = azzawc.length;
	//   16   30:aload_3         
	//   17   31:arraylength     
	//   18   32:istore_2        
		for(i = 0; i < j; i++)
	//*  19   33:iconst_0        
	//*  20   34:istore_1        
	//*  21   35:iload_1         
	//*  22   36:iload_2         
	//*  23   37:icmpge          69
		{
			zzawc zzawc1 = azzawc[i];
	//   24   40:aload_3         
	//   25   41:iload_1         
	//   26   42:aaload          
	//   27   43:astore          5
			zzbzs.put(((Object) (zzawc1.name)), ((Object) (zzawc1)));
	//   28   45:aload_0         
	//   29   46:getfield        #43  <Field Map zzbzs>
	//   30   49:aload           5
	//   31   51:getfield        #49  <Field String zzawc.name>
	//   32   54:aload           5
	//   33   56:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   34   61:pop             
		}

	//   35   62:iload_1         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_1        
	//*  39   66:goto            35
		zzbzr = as;
	//   40   69:aload_0         
	//   41   70:aload           4
	//   42   72:putfield        #57  <Field String[] zzbzr>
		if(zzbzr != null)
	//*  43   75:aload_0         
	//*  44   76:getfield        #57  <Field String[] zzbzr>
	//*  45   79:ifnull          89
			Arrays.sort(((Object []) (zzbzr)));
	//   46   82:aload_0         
	//   47   83:getfield        #57  <Field String[] zzbzr>
	//   48   86:invokestatic    #63  <Method void Arrays.sort(Object[])>
	//   49   89:return          
	}

	public int compareTo(Object obj)
	{
		return zza((zzawa)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class zzawa>
	//    3    5:invokevirtual   #69  <Method int zza(zzawa)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(obj != null)
	//*   4    4:aload_1         
	//*   5    5:ifnull          82
		{
			flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
			if(obj instanceof zzawa)
	//*   8   10:aload_1         
	//*   9   11:instanceof      #2   <Class zzawa>
	//*  10   14:ifeq            82
			{
				obj = ((Object) ((zzawa)obj));
	//   11   17:aload_1         
	//   12   18:checkcast       #2   <Class zzawa>
	//   13   21:astore_1        
				flag = flag1;
	//   14   22:iload_3         
	//   15   23:istore_2        
				if(mVersionCode == ((zzawa) (obj)).mVersionCode)
	//*  16   24:aload_0         
	//*  17   25:getfield        #34  <Field int mVersionCode>
	//*  18   28:aload_1         
	//*  19   29:getfield        #34  <Field int mVersionCode>
	//*  20   32:icmpne          82
				{
					flag = flag1;
	//   21   35:iload_3         
	//   22   36:istore_2        
					if(zzbzp == ((zzawa) (obj)).zzbzp)
	//*  23   37:aload_0         
	//*  24   38:getfield        #36  <Field int zzbzp>
	//*  25   41:aload_1         
	//*  26   42:getfield        #36  <Field int zzbzp>
	//*  27   45:icmpne          82
					{
						flag = flag1;
	//   28   48:iload_3         
	//   29   49:istore_2        
						if(zzaa.equal(((Object) (zzbzs)), ((Object) (((zzawa) (obj)).zzbzs))))
	//*  30   50:aload_0         
	//*  31   51:getfield        #43  <Field Map zzbzs>
	//*  32   54:aload_1         
	//*  33   55:getfield        #43  <Field Map zzbzs>
	//*  34   58:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//*  35   61:ifeq            82
						{
							flag = flag1;
	//   36   64:iload_3         
	//   37   65:istore_2        
							if(Arrays.equals(((Object []) (zzbzr)), ((Object []) (((zzawa) (obj)).zzbzr))))
	//*  38   66:aload_0         
	//*  39   67:getfield        #57  <Field String[] zzbzr>
	//*  40   70:aload_1         
	//*  41   71:getfield        #57  <Field String[] zzbzr>
	//*  42   74:invokestatic    #80  <Method boolean Arrays.equals(Object[], Object[])>
	//*  43   77:ifeq            82
								flag = true;
	//   44   80:iconst_1        
	//   45   81:istore_2        
						}
					}
				}
			}
		}
		return flag;
	//   46   82:iload_2         
	//   47   83:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("Configuration(");
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #86  <String "Configuration(">
	//    3    6:invokespecial   #89  <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(mVersionCode);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #34  <Field int mVersionCode>
	//    8   15:invokevirtual   #93  <Method StringBuilder StringBuilder.append(int)>
	//    9   18:pop             
		stringbuilder.append(", ");
	//   10   19:aload_3         
	//   11   20:ldc1            #95  <String ", ">
	//   12   22:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(zzbzp);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #36  <Field int zzbzp>
	//   17   31:invokevirtual   #93  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
		stringbuilder.append(", ");
	//   19   35:aload_3         
	//   20   36:ldc1            #95  <String ", ">
	//   21   38:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append("(");
	//   23   42:aload_3         
	//   24   43:ldc1            #100 <String "(">
	//   25   45:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		for(Iterator iterator = zzbzs.values().iterator(); iterator.hasNext(); stringbuilder.append(", "))
	//*  27   49:aload_0         
	//*  28   50:getfield        #43  <Field Map zzbzs>
	//*  29   53:invokeinterface #104 <Method Collection Map.values()>
	//*  30   58:invokeinterface #110 <Method Iterator Collection.iterator()>
	//*  31   63:astore          4
	//*  32   65:aload           4
	//*  33   67:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//*  34   72:ifeq            100
			stringbuilder.append(((Object) ((zzawc)iterator.next())));
	//   35   75:aload_3         
	//   36   76:aload           4
	//   37   78:invokeinterface #120 <Method Object Iterator.next()>
	//   38   83:checkcast       #45  <Class zzawc>
	//   39   86:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   40   89:pop             

	//   41   90:aload_3         
	//   42   91:ldc1            #95  <String ", ">
	//   43   93:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
	//*  45   97:goto            65
		stringbuilder.append(")");
	//   46  100:aload_3         
	//   47  101:ldc1            #125 <String ")">
	//   48  103:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
		stringbuilder.append(", ");
	//   50  107:aload_3         
	//   51  108:ldc1            #95  <String ", ">
	//   52  110:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   53  113:pop             
		stringbuilder.append("(");
	//   54  114:aload_3         
	//   55  115:ldc1            #100 <String "(">
	//   56  117:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   57  120:pop             
		if(zzbzr != null)
	//*  58  121:aload_0         
	//*  59  122:getfield        #57  <Field String[] zzbzr>
	//*  60  125:ifnull          168
		{
			String as[] = zzbzr;
	//   61  128:aload_0         
	//   62  129:getfield        #57  <Field String[] zzbzr>
	//   63  132:astore          4
			int j = as.length;
	//   64  134:aload           4
	//   65  136:arraylength     
	//   66  137:istore_2        
			for(int i = 0; i < j; i++)
	//*  67  138:iconst_0        
	//*  68  139:istore_1        
	//*  69  140:iload_1         
	//*  70  141:iload_2         
	//*  71  142:icmpge          175
			{
				stringbuilder.append(as[i]);
	//   72  145:aload_3         
	//   73  146:aload           4
	//   74  148:iload_1         
	//   75  149:aaload          
	//   76  150:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   77  153:pop             
				stringbuilder.append(", ");
	//   78  154:aload_3         
	//   79  155:ldc1            #95  <String ", ">
	//   80  157:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   81  160:pop             
			}

	//   82  161:iload_1         
	//   83  162:iconst_1        
	//   84  163:iadd            
	//   85  164:istore_1        
		} else
	//*  86  165:goto            140
		{
			stringbuilder.append("null");
	//   87  168:aload_3         
	//   88  169:ldc1            #127 <String "null">
	//   89  171:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   90  174:pop             
		}
		stringbuilder.append(")");
	//   91  175:aload_3         
	//   92  176:ldc1            #125 <String ")">
	//   93  178:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   94  181:pop             
		stringbuilder.append(")");
	//   95  182:aload_3         
	//   96  183:ldc1            #125 <String ")">
	//   97  185:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   98  188:pop             
		return stringbuilder.toString();
	//   99  189:aload_3         
	//  100  190:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  101  193:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzawb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #134 <Method void com.google.android.gms.internal.zzawb.zza(zzawa, Parcel, int)>
	//    4    6:return          
	}

	public int zza(zzawa zzawa1)
	{
		return zzbzp - zzawa1.zzbzp;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzbzp>
	//    2    4:aload_1         
	//    3    5:getfield        #36  <Field int zzbzp>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzawb();
	final int mVersionCode;
	public final int zzbzp;
	public final zzawc zzbzq[];
	public final String zzbzr[];
	public final Map zzbzs = new TreeMap();

	static 
	{
	//    0    0:new             #24  <Class zzawb>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzawb()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
