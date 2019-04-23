// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzi, Gap, Dot, Dash

public class PatternItem extends AbstractSafeParcelable
{

	public PatternItem(int i, Float float1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		boolean flag = flag1;
	//    4    7:iload           4
	//    5    9:istore_3        
		if(i != 1)
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:icmpeq          36
			if(float1 != null && float1.floatValue() >= 0.0F)
	//*   9   15:aload_2         
	//*  10   16:ifnull          34
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #49  <Method float Float.floatValue()>
	//*  13   23:fconst_0        
	//*  14   24:fcmpl           
	//*  15   25:iflt            34
				flag = flag1;
	//   16   28:iload           4
	//   17   30:istore_3        
			else
	//*  18   31:goto            36
				flag = false;
	//   19   34:iconst_0        
	//   20   35:istore_3        
		String s = String.valueOf(((Object) (float1)));
	//   21   36:aload_2         
	//   22   37:invokestatic    #55  <Method String String.valueOf(Object)>
	//   23   40:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 45);
	//   24   42:new             #57  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:aload           5
	//   27   48:invokestatic    #55  <Method String String.valueOf(Object)>
	//   28   51:invokevirtual   #61  <Method int String.length()>
	//   29   54:bipush          45
	//   30   56:iadd            
	//   31   57:invokespecial   #64  <Method void StringBuilder(int)>
	//   32   60:astore          6
		stringbuilder.append("Invalid PatternItem: type=");
	//   33   62:aload           6
	//   34   64:ldc1            #66  <String "Invalid PatternItem: type=">
	//   35   66:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		stringbuilder.append(i);
	//   37   70:aload           6
	//   38   72:iload_1         
	//   39   73:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   40   76:pop             
		stringbuilder.append(" length=");
	//   41   77:aload           6
	//   42   79:ldc1            #75  <String " length=">
	//   43   81:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
		stringbuilder.append(s);
	//   45   85:aload           6
	//   46   87:aload           5
	//   47   89:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   49   93:iload_3         
	//   50   94:aload           6
	//   51   96:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   52   99:invokestatic    #85  <Method void Preconditions.checkArgument(boolean, Object)>
		type = i;
	//   53  102:aload_0         
	//   54  103:iload_1         
	//   55  104:putfield        #87  <Field int type>
		zzdu = float1;
	//   56  107:aload_0         
	//   57  108:aload_2         
	//   58  109:putfield        #89  <Field Float zzdu>
	//   59  112:return          
	}

	static List zza(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList(list.size());
	//    4    6:new             #95  <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokeinterface #100 <Method int List.size()>
	//    8   16:invokespecial   #101 <Method void ArrayList(int)>
	//    9   19:astore_2        
		for(Iterator iterator = list.iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (list))))
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #105 <Method Iterator List.iterator()>
	//*  12   26:astore_3        
	//*  13   27:aload_3         
	//*  14   28:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            188
		{
			list = ((List) ((PatternItem)iterator.next()));
	//   16   36:aload_3         
	//   17   37:invokeinterface #115 <Method Object Iterator.next()>
	//   18   42:checkcast       #2   <Class PatternItem>
	//   19   45:astore_0        
			if(list == null)
	//*  20   46:aload_0         
	//*  21   47:ifnonnull       55
			{
				list = null;
	//   22   50:aconst_null     
	//   23   51:astore_0        
				continue;
	//   24   52:goto            177
			}
			int i = ((PatternItem) (list)).type;
	//   25   55:aload_0         
	//   26   56:getfield        #87  <Field int type>
	//   27   59:istore_1        
			switch(i)
	//*  28   60:iload_1         
			{
	//*  29   61:tableswitch     0 2: default 88
	//	               0 162
	//	               1 151
	//	               2 133
			default:
				String s = TAG;
	//   30   88:getstatic       #117 <Field String TAG>
	//   31   91:astore          4
				StringBuilder stringbuilder = new StringBuilder(37);
	//   32   93:new             #57  <Class StringBuilder>
	//   33   96:dup             
	//   34   97:bipush          37
	//   35   99:invokespecial   #64  <Method void StringBuilder(int)>
	//   36  102:astore          5
				stringbuilder.append("Unknown PatternItem type: ");
	//   37  104:aload           5
	//   38  106:ldc1            #119 <String "Unknown PatternItem type: ">
	//   39  108:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   40  111:pop             
				stringbuilder.append(i);
	//   41  112:aload           5
	//   42  114:iload_1         
	//   43  115:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   44  118:pop             
				Log.w(s, stringbuilder.toString());
	//   45  119:aload           4
	//   46  121:aload           5
	//   47  123:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   48  126:invokestatic    #125 <Method int Log.w(String, String)>
	//   49  129:pop             
				break;

	//*  50  130:goto            177
			case 2: // '\002'
				list = ((List) (new Gap(((PatternItem) (list)).zzdu.floatValue())));
	//   51  133:new             #127 <Class Gap>
	//   52  136:dup             
	//   53  137:aload_0         
	//   54  138:getfield        #89  <Field Float zzdu>
	//   55  141:invokevirtual   #49  <Method float Float.floatValue()>
	//   56  144:invokespecial   #130 <Method void Gap(float)>
	//   57  147:astore_0        
				break;

	//*  58  148:goto            177
			case 1: // '\001'
				list = ((List) (new Dot()));
	//   59  151:new             #132 <Class Dot>
	//   60  154:dup             
	//   61  155:invokespecial   #133 <Method void Dot()>
	//   62  158:astore_0        
				break;

	//*  63  159:goto            177
			case 0: // '\0'
				list = ((List) (new Dash(((PatternItem) (list)).zzdu.floatValue())));
	//   64  162:new             #135 <Class Dash>
	//   65  165:dup             
	//   66  166:aload_0         
	//   67  167:getfield        #89  <Field Float zzdu>
	//   68  170:invokevirtual   #49  <Method float Float.floatValue()>
	//   69  173:invokespecial   #136 <Method void Dash(float)>
	//   70  176:astore_0        
				break;
			}
		}

	//   71  177:aload_2         
	//   72  178:aload_0         
	//   73  179:invokeinterface #140 <Method boolean List.add(Object)>
	//   74  184:pop             
	//*  75  185:goto            27
		return ((List) (arraylist));
	//   76  188:aload_2         
	//   77  189:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof PatternItem))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PatternItem>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((PatternItem)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PatternItem>
	//   12   20:astore_1        
		return type == ((PatternItem) (obj)).type && Objects.equal(((Object) (zzdu)), ((Object) (((PatternItem) (obj)).zzdu)));
	//   13   21:aload_0         
	//   14   22:getfield        #87  <Field int type>
	//   15   25:aload_1         
	//   16   26:getfield        #87  <Field int type>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #89  <Field Float zzdu>
	//   20   36:aload_1         
	//   21   37:getfield        #89  <Field Float zzdu>
	//   22   40:invokestatic    #149 <Method boolean Objects.equal(Object, Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(type), zzdu
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #87  <Field int type>
	//    6   10:invokestatic    #157 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #89  <Field Float zzdu>
	//   12   20:aastore         
	//   13   21:invokestatic    #160 <Method int Objects.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		int i = type;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int type>
	//    2    4:istore_1        
		String s = String.valueOf(((Object) (zzdu)));
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field Float zzdu>
	//    5    9:invokestatic    #55  <Method String String.valueOf(Object)>
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 39);
	//    7   13:new             #57  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #55  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #61  <Method int String.length()>
	//   12   24:bipush          39
	//   13   26:iadd            
	//   14   27:invokespecial   #64  <Method void StringBuilder(int)>
	//   15   30:astore_3        
		stringbuilder.append("[PatternItem: type=");
	//   16   31:aload_3         
	//   17   32:ldc1            #162 <String "[PatternItem: type=">
	//   18   34:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(i);
	//   20   38:aload_3         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
		stringbuilder.append(" length=");
	//   24   44:aload_3         
	//   25   45:ldc1            #75  <String " length=">
	//   26   47:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(s);
	//   28   51:aload_3         
	//   29   52:aload_2         
	//   30   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		stringbuilder.append("]");
	//   32   57:aload_3         
	//   33   58:ldc1            #164 <String "]">
	//   34   60:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		return stringbuilder.toString();
	//   36   64:aload_3         
	//   37   65:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   38   68:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, type);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field int type>
	//    7   11:invokestatic    #176 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloatObject(parcel, 3, zzdu, false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #89  <Field Float zzdu>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #180 <Method void SafeParcelWriter.writeFloatObject(Parcel, int, Float, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #183 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	private static final String TAG = "PatternItem";
	private final int type;
	private final Float zzdu;

	static 
	{
	//    0    0:new             #33  <Class zzi>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzi()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
