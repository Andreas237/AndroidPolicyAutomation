// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.phenotype:
//			c, zzi, m

public class Configuration extends AbstractSafeParcelable
	implements Comparable
{

	public Configuration(int i, zzi azzi[], String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int a>
		b = azzi;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field zzi[] b>
	//    8   14:aload_0         
	//    9   15:new             #34  <Class TreeMap>
	//   10   18:dup             
	//   11   19:invokespecial   #35  <Method void TreeMap()>
	//   12   22:putfield        #37  <Field Map d>
		int j = azzi.length;
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
			zzi zzi1 = azzi[i];
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:aaload          
	//   24   40:astore          5
			d.put(((Object) (zzi1.a)), ((Object) (zzi1)));
	//   25   42:aload_0         
	//   26   43:getfield        #37  <Field Map d>
	//   27   46:aload           5
	//   28   48:getfield        #42  <Field String zzi.a>
	//   29   51:aload           5
	//   30   53:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   31   58:pop             
		}

	//   32   59:iload_1         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_1        
	//*  36   63:goto            31
		c = as;
	//   37   66:aload_0         
	//   38   67:aload_3         
	//   39   68:putfield        #50  <Field String[] c>
		azzi = ((zzi []) (c));
	//   40   71:aload_0         
	//   41   72:getfield        #50  <Field String[] c>
	//   42   75:astore_2        
		if(azzi != null)
	//*  43   76:aload_2         
	//*  44   77:ifnull          84
			Arrays.sort(((Object []) (azzi)));
	//   45   80:aload_2         
	//   46   81:invokestatic    #56  <Method void Arrays.sort(Object[])>
	//   47   84:return          
	}

	public int compareTo(Object obj)
	{
		obj = ((Object) ((Configuration)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class Configuration>
	//    2    4:astore_1        
		return a - ((Configuration) (obj)).a;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int a>
	//    5    9:aload_1         
	//    6   10:getfield        #30  <Field int a>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Configuration)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Configuration>
	//*   2    4:ifeq            53
		{
			obj = ((Object) ((Configuration)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Configuration>
	//    5   11:astore_1        
			if(a == ((Configuration) (obj)).a && m.a(((Object) (d)), ((Object) (((Configuration) (obj)).d))) && Arrays.equals(((Object []) (c)), ((Object []) (((Configuration) (obj)).c))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #30  <Field int a>
	//*   8   16:aload_1         
	//*   9   17:getfield        #30  <Field int a>
	//*  10   20:icmpne          53
	//*  11   23:aload_0         
	//*  12   24:getfield        #37  <Field Map d>
	//*  13   27:aload_1         
	//*  14   28:getfield        #37  <Field Map d>
	//*  15   31:invokestatic    #65  <Method boolean m.a(Object, Object)>
	//*  16   34:ifeq            53
	//*  17   37:aload_0         
	//*  18   38:getfield        #50  <Field String[] c>
	//*  19   41:aload_1         
	//*  20   42:getfield        #50  <Field String[] c>
	//*  21   45:invokestatic    #68  <Method boolean Arrays.equals(Object[], Object[])>
	//*  22   48:ifeq            53
				return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
		}
		return false;
	//   25   53:iconst_0        
	//   26   54:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("Configuration(");
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #74  <String "Configuration(">
	//    3    6:invokespecial   #77  <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(a);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #30  <Field int a>
	//    8   15:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//    9   18:pop             
		stringbuilder.append(", ");
	//   10   19:aload_3         
	//   11   20:ldc1            #83  <String ", ">
	//   12   22:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append("(");
	//   14   26:aload_3         
	//   15   27:ldc1            #88  <String "(">
	//   16   29:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		for(Iterator iterator = d.values().iterator(); iterator.hasNext(); stringbuilder.append(", "))
	//*  18   33:aload_0         
	//*  19   34:getfield        #37  <Field Map d>
	//*  20   37:invokeinterface #92  <Method Collection Map.values()>
	//*  21   42:invokeinterface #98  <Method Iterator Collection.iterator()>
	//*  22   47:astore          4
	//*  23   49:aload           4
	//*  24   51:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//*  25   56:ifeq            84
			stringbuilder.append(((Object) ((zzi)iterator.next())));
	//   26   59:aload_3         
	//   27   60:aload           4
	//   28   62:invokeinterface #108 <Method Object Iterator.next()>
	//   29   67:checkcast       #39  <Class zzi>
	//   30   70:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
	//   31   73:pop             

	//   32   74:aload_3         
	//   33   75:ldc1            #83  <String ", ">
	//   34   77:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   35   80:pop             
	//*  36   81:goto            49
		stringbuilder.append(")");
	//   37   84:aload_3         
	//   38   85:ldc1            #113 <String ")">
	//   39   87:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   40   90:pop             
		stringbuilder.append(", ");
	//   41   91:aload_3         
	//   42   92:ldc1            #83  <String ", ">
	//   43   94:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
		stringbuilder.append("(");
	//   45   98:aload_3         
	//   46   99:ldc1            #88  <String "(">
	//   47  101:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   48  104:pop             
		String as[] = c;
	//   49  105:aload_0         
	//   50  106:getfield        #50  <Field String[] c>
	//   51  109:astore          4
		if(as != null)
	//*  52  111:aload           4
	//*  53  113:ifnull          150
		{
			int j = as.length;
	//   54  116:aload           4
	//   55  118:arraylength     
	//   56  119:istore_2        
			for(int i = 0; i < j; i++)
	//*  57  120:iconst_0        
	//*  58  121:istore_1        
	//*  59  122:iload_1         
	//*  60  123:iload_2         
	//*  61  124:icmpge          157
			{
				stringbuilder.append(as[i]);
	//   62  127:aload_3         
	//   63  128:aload           4
	//   64  130:iload_1         
	//   65  131:aaload          
	//   66  132:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
				stringbuilder.append(", ");
	//   68  136:aload_3         
	//   69  137:ldc1            #83  <String ", ">
	//   70  139:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   71  142:pop             
			}

	//   72  143:iload_1         
	//   73  144:iconst_1        
	//   74  145:iadd            
	//   75  146:istore_1        
		} else
	//*  76  147:goto            122
		{
			stringbuilder.append("null");
	//   77  150:aload_3         
	//   78  151:ldc1            #115 <String "null">
	//   79  153:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   80  156:pop             
		}
		stringbuilder.append(")");
	//   81  157:aload_3         
	//   82  158:ldc1            #113 <String ")">
	//   83  160:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   84  163:pop             
		stringbuilder.append(")");
	//   85  164:aload_3         
	//   86  165:ldc1            #113 <String ")">
	//   87  167:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   88  170:pop             
		return stringbuilder.toString();
	//   89  171:aload_3         
	//   90  172:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   91  175:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #124 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field int a>
	//    7   11:invokestatic    #127 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable []) (b)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #32  <Field zzi[] b>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #130 <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c, false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #50  <Field String[] c>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #133 <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #135 <Method void c.a(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.phenotype.c();
	private final int a;
	private final zzi b[];
	private final String c[];
	private final Map d = new TreeMap();

	static 
	{
	//    0    0:new             #20  <Class com.google.android.gms.phenotype.c>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.phenotype.c()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
