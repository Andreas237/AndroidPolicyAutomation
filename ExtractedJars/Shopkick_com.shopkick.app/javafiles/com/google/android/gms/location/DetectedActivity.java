// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//			zzh, zzi

public class DetectedActivity extends AbstractSafeParcelable
{

	public DetectedActivity(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void AbstractSafeParcelable()>
		zzi = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #68  <Field int zzi>
		zzs = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #70  <Field int zzs>
	//    8   14:return          
	}

	public static void zzb(int i)
	{
		int ai[] = zzr;
	//    0    0:getstatic       #56  <Field int[] zzr>
	//    1    3:astore          4
		int k = ai.length;
	//    2    5:aload           4
	//    3    7:arraylength     
	//    4    8:istore_3        
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		for(; j < k; j++)
	//*   9   13:iload_1         
	//*  10   14:iload_3         
	//*  11   15:icmpge          35
			if(ai[j] == i)
	//*  12   18:aload           4
	//*  13   20:iload_1         
	//*  14   21:iaload          
	//*  15   22:iload_0         
	//*  16   23:icmpne          28
				flag = true;
	//   17   26:iconst_1        
	//   18   27:istore_2        

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_1        
	//*  23   32:goto            13
		if(!flag)
	//*  24   35:iload_2         
	//*  25   36:ifne            76
		{
			StringBuilder stringbuilder = new StringBuilder(81);
	//   26   39:new             #76  <Class StringBuilder>
	//   27   42:dup             
	//   28   43:bipush          81
	//   29   45:invokespecial   #78  <Method void StringBuilder(int)>
	//   30   48:astore          4
			stringbuilder.append(i);
	//   31   50:aload           4
	//   32   52:iload_0         
	//   33   53:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   34   56:pop             
			stringbuilder.append(" is not a valid DetectedActivity supported by Activity Transition API.");
	//   35   57:aload           4
	//   36   59:ldc1            #84  <String " is not a valid DetectedActivity supported by Activity Transition API.">
	//   37   61:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   38   64:pop             
			Log.w("DetectedActivity", stringbuilder.toString());
	//   39   65:ldc1            #89  <String "DetectedActivity">
	//   40   67:aload           4
	//   41   69:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   42   72:invokestatic    #99  <Method int Log.w(String, String)>
	//   43   75:pop             
		}
	//   44   76:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          53
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #107 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #107 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DetectedActivity)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DetectedActivity>
	//   16   28:astore_1        
			if(zzi == ((DetectedActivity) (obj)).zzi && zzs == ((DetectedActivity) (obj)).zzs)
	//*  17   29:aload_0         
	//*  18   30:getfield        #68  <Field int zzi>
	//*  19   33:aload_1         
	//*  20   34:getfield        #68  <Field int zzi>
	//*  21   37:icmpne          53
	//*  22   40:aload_0         
	//*  23   41:getfield        #70  <Field int zzs>
	//*  24   44:aload_1         
	//*  25   45:getfield        #70  <Field int zzs>
	//*  26   48:icmpne          53
				return true;
	//   27   51:iconst_1        
	//   28   52:ireturn         
		}
		return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	public int getConfidence()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int zzs>
	//    2    4:ireturn         
	}

	public int getType()
	{
		int i = zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zzi>
	//    2    4:istore_1        
		if(i <= 19 && i >= 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          19
	//*   5    8:icmpgt          20
	//*   6   11:iload_1         
	//*   7   12:ifge            18
	//*   8   15:goto            20
			return i;
	//    9   18:iload_1         
	//   10   19:ireturn         
		else
			return 4;
	//   11   20:iconst_4        
	//   12   21:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzi), Integer.valueOf(zzs)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #68  <Field int zzi>
	//    6   10:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #70  <Field int zzs>
	//   12   20:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:invokestatic    #122 <Method int Objects.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		int i = getType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method int getType()>
	//    2    4:istore_1        
		String s;
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     0 5: default 44
	//	               0 174
	//	               1 168
	//	               2 162
	//	               3 156
	//	               4 150
	//	               5 144
		default:
			switch(i)
	//*   5   44:iload_1         
			{
	//*   6   45:tableswitch     7 8: default 68
	//	               7 138
	//	               8 132
			default:
				switch(i)
	//*   7   68:iload_1         
				{
	//*   8   69:tableswitch     16 19: default 100
	//	               16 126
	//	               17 120
	//	               18 114
	//	               19 108
				default:
					s = Integer.toString(i);
	//    9  100:iload_1         
	//   10  101:invokestatic    #127 <Method String Integer.toString(int)>
	//   11  104:astore_2        
					break;

	//*  12  105:goto            177
				case 19: // '\023'
					s = "IN_FOUR_WHEELER_VEHICLE";
	//   13  108:ldc1            #129 <String "IN_FOUR_WHEELER_VEHICLE">
	//   14  110:astore_2        
					break;

	//*  15  111:goto            177
				case 18: // '\022'
					s = "IN_TWO_WHEELER_VEHICLE";
	//   16  114:ldc1            #131 <String "IN_TWO_WHEELER_VEHICLE">
	//   17  116:astore_2        
					break;

	//*  18  117:goto            177
				case 17: // '\021'
					s = "IN_RAIL_VEHICLE";
	//   19  120:ldc1            #133 <String "IN_RAIL_VEHICLE">
	//   20  122:astore_2        
					break;

	//*  21  123:goto            177
				case 16: // '\020'
					s = "IN_ROAD_VEHICLE";
	//   22  126:ldc1            #135 <String "IN_ROAD_VEHICLE">
	//   23  128:astore_2        
					break;
				}
				break;

	//*  24  129:goto            177
			case 8: // '\b'
				s = "RUNNING";
	//   25  132:ldc1            #136 <String "RUNNING">
	//   26  134:astore_2        
				break;

	//*  27  135:goto            177
			case 7: // '\007'
				s = "WALKING";
	//   28  138:ldc1            #137 <String "WALKING">
	//   29  140:astore_2        
				break;
			}
			break;

	//*  30  141:goto            177
		case 5: // '\005'
			s = "TILTING";
	//   31  144:ldc1            #138 <String "TILTING">
	//   32  146:astore_2        
			break;

	//*  33  147:goto            177
		case 4: // '\004'
			s = "UNKNOWN";
	//   34  150:ldc1            #139 <String "UNKNOWN">
	//   35  152:astore_2        
			break;

	//*  36  153:goto            177
		case 3: // '\003'
			s = "STILL";
	//   37  156:ldc1            #140 <String "STILL">
	//   38  158:astore_2        
			break;

	//*  39  159:goto            177
		case 2: // '\002'
			s = "ON_FOOT";
	//   40  162:ldc1            #141 <String "ON_FOOT">
	//   41  164:astore_2        
			break;

	//*  42  165:goto            177
		case 1: // '\001'
			s = "ON_BICYCLE";
	//   43  168:ldc1            #142 <String "ON_BICYCLE">
	//   44  170:astore_2        
			break;

	//*  45  171:goto            177
		case 0: // '\0'
			s = "IN_VEHICLE";
	//   46  174:ldc1            #143 <String "IN_VEHICLE">
	//   47  176:astore_2        
			break;
		}
		i = zzs;
	//   48  177:aload_0         
	//   49  178:getfield        #70  <Field int zzs>
	//   50  181:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 48);
	//   51  182:new             #76  <Class StringBuilder>
	//   52  185:dup             
	//   53  186:aload_2         
	//   54  187:invokestatic    #148 <Method String String.valueOf(Object)>
	//   55  190:invokevirtual   #151 <Method int String.length()>
	//   56  193:bipush          48
	//   57  195:iadd            
	//   58  196:invokespecial   #78  <Method void StringBuilder(int)>
	//   59  199:astore_3        
		stringbuilder.append("DetectedActivity [type=");
	//   60  200:aload_3         
	//   61  201:ldc1            #153 <String "DetectedActivity [type=">
	//   62  203:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   63  206:pop             
		stringbuilder.append(s);
	//   64  207:aload_3         
	//   65  208:aload_2         
	//   66  209:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   67  212:pop             
		stringbuilder.append(", confidence=");
	//   68  213:aload_3         
	//   69  214:ldc1            #155 <String ", confidence=">
	//   70  216:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   71  219:pop             
		stringbuilder.append(i);
	//   72  220:aload_3         
	//   73  221:iload_1         
	//   74  222:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   75  225:pop             
		stringbuilder.append("]");
	//   76  226:aload_3         
	//   77  227:ldc1            #157 <String "]">
	//   78  229:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   79  232:pop             
		return stringbuilder.toString();
	//   80  233:aload_3         
	//   81  234:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   82  237:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #165 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzi);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #68  <Field int zzi>
	//    7   11:invokestatic    #169 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zzs);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #70  <Field int zzs>
	//   12   20:invokestatic    #169 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #172 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   16   28:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzi();
	public static final int IN_VEHICLE = 0;
	public static final int ON_BICYCLE = 1;
	public static final int ON_FOOT = 2;
	public static final int RUNNING = 8;
	public static final int STILL = 3;
	public static final int TILTING = 5;
	public static final int UNKNOWN = 4;
	public static final int WALKING = 7;
	private static final Comparator zzo = new zzh();
	private static final int zzp[] = {
		9, 10
	};
	private static final int zzq[] = {
		0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 
		12, 13, 14, 16, 17, 18, 19
	};
	private static final int zzr[] = {
		0, 1, 2, 3, 7, 8, 16, 17
	};
	private int zzi;
	private int zzs;

	static 
	{
	//    0    0:new             #45  <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzh()>
	//    3    7:putstatic       #50  <Field Comparator zzo>
	//    4   10:iconst_2        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:bipush          9
	//    9   17:iastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:bipush          10
	//   13   22:iastore         
	//   14   23:putstatic       #52  <Field int[] zzp>
	//   15   26:bipush          17
	//   16   28:newarray        int[]
	//   17   30:dup             
	//   18   31:iconst_0        
	//   19   32:iconst_0        
	//   20   33:iastore         
	//   21   34:dup             
	//   22   35:iconst_1        
	//   23   36:iconst_1        
	//   24   37:iastore         
	//   25   38:dup             
	//   26   39:iconst_2        
	//   27   40:iconst_2        
	//   28   41:iastore         
	//   29   42:dup             
	//   30   43:iconst_3        
	//   31   44:iconst_4        
	//   32   45:iastore         
	//   33   46:dup             
	//   34   47:iconst_4        
	//   35   48:iconst_5        
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_5        
	//   39   52:bipush          6
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:bipush          6
	//   43   58:bipush          7
	//   44   60:iastore         
	//   45   61:dup             
	//   46   62:bipush          7
	//   47   64:bipush          8
	//   48   66:iastore         
	//   49   67:dup             
	//   50   68:bipush          8
	//   51   70:bipush          10
	//   52   72:iastore         
	//   53   73:dup             
	//   54   74:bipush          9
	//   55   76:bipush          11
	//   56   78:iastore         
	//   57   79:dup             
	//   58   80:bipush          10
	//   59   82:bipush          12
	//   60   84:iastore         
	//   61   85:dup             
	//   62   86:bipush          11
	//   63   88:bipush          13
	//   64   90:iastore         
	//   65   91:dup             
	//   66   92:bipush          12
	//   67   94:bipush          14
	//   68   96:iastore         
	//   69   97:dup             
	//   70   98:bipush          13
	//   71  100:bipush          16
	//   72  102:iastore         
	//   73  103:dup             
	//   74  104:bipush          14
	//   75  106:bipush          17
	//   76  108:iastore         
	//   77  109:dup             
	//   78  110:bipush          15
	//   79  112:bipush          18
	//   80  114:iastore         
	//   81  115:dup             
	//   82  116:bipush          16
	//   83  118:bipush          19
	//   84  120:iastore         
	//   85  121:putstatic       #54  <Field int[] zzq>
	//   86  124:bipush          8
	//   87  126:newarray        int[]
	//   88  128:dup             
	//   89  129:iconst_0        
	//   90  130:iconst_0        
	//   91  131:iastore         
	//   92  132:dup             
	//   93  133:iconst_1        
	//   94  134:iconst_1        
	//   95  135:iastore         
	//   96  136:dup             
	//   97  137:iconst_2        
	//   98  138:iconst_2        
	//   99  139:iastore         
	//  100  140:dup             
	//  101  141:iconst_3        
	//  102  142:iconst_3        
	//  103  143:iastore         
	//  104  144:dup             
	//  105  145:iconst_4        
	//  106  146:bipush          7
	//  107  148:iastore         
	//  108  149:dup             
	//  109  150:iconst_5        
	//  110  151:bipush          8
	//  111  153:iastore         
	//  112  154:dup             
	//  113  155:bipush          6
	//  114  157:bipush          16
	//  115  159:iastore         
	//  116  160:dup             
	//  117  161:bipush          7
	//  118  163:bipush          17
	//  119  165:iastore         
	//  120  166:putstatic       #56  <Field int[] zzr>
	//  121  169:new             #58  <Class zzi>
	//  122  172:dup             
	//  123  173:invokespecial   #59  <Method void zzi()>
	//  124  176:putstatic       #61  <Field android.os.Parcelable$Creator CREATOR>
	//* 125  179:return          
	}
}
