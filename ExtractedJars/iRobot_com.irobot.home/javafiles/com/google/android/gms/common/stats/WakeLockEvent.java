// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, zza

public final class WakeLockEvent extends StatsEvent
{

	WakeLockEvent(int i, long l, int j, String s, int k, List list, 
			String s1, long l1, int i1, String s2, String s3, float f, 
			long l2, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void StatsEvent()>
		zzg = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #78  <Field int zzg>
		zzfo = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #80  <Field long zzfo>
		zzfp = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #82  <Field int zzfp>
		zzfq = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #84  <Field String zzfq>
		zzfr = s2;
	//   14   26:aload_0         
	//   15   27:aload           12
	//   16   29:putfield        #86  <Field String zzfr>
		zzfs = s4;
	//   17   32:aload_0         
	//   18   33:aload           17
	//   19   35:putfield        #88  <Field String zzfs>
		zzft = k;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #90  <Field int zzft>
		zzga = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #91  <Long -1L>
	//   25   48:putfield        #94  <Field long zzga>
		zzfu = list;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #96  <Field List zzfu>
		zzfv = s1;
	//   29   57:aload_0         
	//   30   58:aload           8
	//   31   60:putfield        #98  <Field String zzfv>
		zzfw = l1;
	//   32   63:aload_0         
	//   33   64:lload           9
	//   34   66:putfield        #100 <Field long zzfw>
		zzfx = i1;
	//   35   69:aload_0         
	//   36   70:iload           11
	//   37   72:putfield        #102 <Field int zzfx>
		zzfy = s3;
	//   38   75:aload_0         
	//   39   76:aload           13
	//   40   78:putfield        #104 <Field String zzfy>
		zzfz = f;
	//   41   81:aload_0         
	//   42   82:fload           14
	//   43   84:putfield        #106 <Field float zzfz>
		mTimeout = l2;
	//   44   87:aload_0         
	//   45   88:lload           15
	//   46   90:putfield        #108 <Field long mTimeout>
	//   47   93:return          
	}

	public WakeLockEvent(long l, int i, String s, int j, List list, String s1, 
			long l1, int k, String s2, String s3, float f, long l2, String s4)
	{
		this(2, l, i, s, j, list, s1, l1, k, s2, s3, f, l2, s4);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:lload_1         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:lload           8
	//    9   14:iload           10
	//   10   16:aload           11
	//   11   18:aload           12
	//   12   20:fload           13
	//   13   22:lload           14
	//   14   24:aload           16
	//   15   26:invokespecial   #115 <Method void WakeLockEvent(int, long, int, String, int, List, String, long, int, String, String, float, long, String)>
	//   16   29:return          
	}

	public final int getEventType()
	{
		return zzfp;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int zzfp>
	//    2    4:ireturn         
	}

	public final long getTimeMillis()
	{
		return zzfo;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field long zzfo>
	//    2    4:lreturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #126 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzg);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field int zzg>
	//    7   11:invokestatic    #130 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 2, ((StatsEvent)this).getTimeMillis());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #132 <Method long StatsEvent.getTimeMillis()>
	//   12   20:invokestatic    #136 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 4, zzfq, false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #84  <Field String zzfq>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #140 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 5, zzft);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #90  <Field int zzft>
	//   23   39:invokestatic    #130 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeStringList(parcel, 6, zzfu, false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #96  <Field List zzfu>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #144 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, zzfw);
	//   30   53:aload_1         
	//   31   54:bipush          8
	//   32   56:aload_0         
	//   33   57:getfield        #100 <Field long zzfw>
	//   34   60:invokestatic    #136 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 10, zzfr, false);
	//   35   63:aload_1         
	//   36   64:bipush          10
	//   37   66:aload_0         
	//   38   67:getfield        #86  <Field String zzfr>
	//   39   70:iconst_0        
	//   40   71:invokestatic    #140 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, ((StatsEvent)this).getEventType());
	//   41   74:aload_1         
	//   42   75:bipush          11
	//   43   77:aload_0         
	//   44   78:invokevirtual   #146 <Method int StatsEvent.getEventType()>
	//   45   81:invokestatic    #130 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 12, zzfv, false);
	//   46   84:aload_1         
	//   47   85:bipush          12
	//   48   87:aload_0         
	//   49   88:getfield        #98  <Field String zzfv>
	//   50   91:iconst_0        
	//   51   92:invokestatic    #140 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 13, zzfy, false);
	//   52   95:aload_1         
	//   53   96:bipush          13
	//   54   98:aload_0         
	//   55   99:getfield        #104 <Field String zzfy>
	//   56  102:iconst_0        
	//   57  103:invokestatic    #140 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 14, zzfx);
	//   58  106:aload_1         
	//   59  107:bipush          14
	//   60  109:aload_0         
	//   61  110:getfield        #102 <Field int zzfx>
	//   62  113:invokestatic    #130 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeFloat(parcel, 15, zzfz);
	//   63  116:aload_1         
	//   64  117:bipush          15
	//   65  119:aload_0         
	//   66  120:getfield        #106 <Field float zzfz>
	//   67  123:invokestatic    #150 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeLong(parcel, 16, mTimeout);
	//   68  126:aload_1         
	//   69  127:bipush          16
	//   70  129:aload_0         
	//   71  130:getfield        #108 <Field long mTimeout>
	//   72  133:invokestatic    #136 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 17, zzfs, false);
	//   73  136:aload_1         
	//   74  137:bipush          17
	//   75  139:aload_0         
	//   76  140:getfield        #88  <Field String zzfs>
	//   77  143:iconst_0        
	//   78  144:invokestatic    #140 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   79  147:aload_1         
	//   80  148:iload_2         
	//   81  149:invokestatic    #153 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   82  152:return          
	}

	public final long zzu()
	{
		return zzga;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long zzga>
	//    2    4:lreturn         
	}

	public final String zzv()
	{
		String s4 = zzfq;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzfq>
	//    2    4:astore          8
		int i = zzft;
	//    3    6:aload_0         
	//    4    7:getfield        #90  <Field int zzft>
	//    5   10:istore_2        
		String s;
		if(zzfu == null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #96  <Field List zzfu>
	//*   8   15:ifnonnull       25
			s = "";
	//    9   18:ldc1            #158 <String "">
	//   10   20:astore          4
		else
	//*  11   22:goto            36
			s = TextUtils.join(",", ((Iterable) (zzfu)));
	//   12   25:ldc1            #160 <String ",">
	//   13   27:aload_0         
	//   14   28:getfield        #96  <Field List zzfu>
	//   15   31:invokestatic    #166 <Method String TextUtils.join(CharSequence, Iterable)>
	//   16   34:astore          4
		int j = zzfx;
	//   17   36:aload_0         
	//   18   37:getfield        #102 <Field int zzfx>
	//   19   40:istore_3        
		String s1;
		if(zzfr == null)
	//*  20   41:aload_0         
	//*  21   42:getfield        #86  <Field String zzfr>
	//*  22   45:ifnonnull       55
			s1 = "";
	//   23   48:ldc1            #158 <String "">
	//   24   50:astore          5
		else
	//*  25   52:goto            61
			s1 = zzfr;
	//   26   55:aload_0         
	//   27   56:getfield        #86  <Field String zzfr>
	//   28   59:astore          5
		String s2;
		if(zzfy == null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #104 <Field String zzfy>
	//*  31   65:ifnonnull       75
			s2 = "";
	//   32   68:ldc1            #158 <String "">
	//   33   70:astore          6
		else
	//*  34   72:goto            81
			s2 = zzfy;
	//   35   75:aload_0         
	//   36   76:getfield        #104 <Field String zzfy>
	//   37   79:astore          6
		float f = zzfz;
	//   38   81:aload_0         
	//   39   82:getfield        #106 <Field float zzfz>
	//   40   85:fstore_1        
		String s3;
		if(zzfs == null)
	//*  41   86:aload_0         
	//*  42   87:getfield        #88  <Field String zzfs>
	//*  43   90:ifnonnull       100
			s3 = "";
	//   44   93:ldc1            #158 <String "">
	//   45   95:astore          7
		else
	//*  46   97:goto            106
			s3 = zzfs;
	//   47  100:aload_0         
	//   48  101:getfield        #88  <Field String zzfs>
	//   49  104:astore          7
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s4))).length() + 45 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//   50  106:new             #168 <Class StringBuilder>
	//   51  109:dup             
	//   52  110:aload           8
	//   53  112:invokestatic    #174 <Method String String.valueOf(Object)>
	//   54  115:invokevirtual   #177 <Method int String.length()>
	//   55  118:bipush          45
	//   56  120:iadd            
	//   57  121:aload           4
	//   58  123:invokestatic    #174 <Method String String.valueOf(Object)>
	//   59  126:invokevirtual   #177 <Method int String.length()>
	//   60  129:iadd            
	//   61  130:aload           5
	//   62  132:invokestatic    #174 <Method String String.valueOf(Object)>
	//   63  135:invokevirtual   #177 <Method int String.length()>
	//   64  138:iadd            
	//   65  139:aload           6
	//   66  141:invokestatic    #174 <Method String String.valueOf(Object)>
	//   67  144:invokevirtual   #177 <Method int String.length()>
	//   68  147:iadd            
	//   69  148:aload           7
	//   70  150:invokestatic    #174 <Method String String.valueOf(Object)>
	//   71  153:invokevirtual   #177 <Method int String.length()>
	//   72  156:iadd            
	//   73  157:invokespecial   #180 <Method void StringBuilder(int)>
	//   74  160:astore          9
		stringbuilder.append("\t");
	//   75  162:aload           9
	//   76  164:ldc1            #182 <String "\t">
	//   77  166:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   78  169:pop             
		stringbuilder.append(s4);
	//   79  170:aload           9
	//   80  172:aload           8
	//   81  174:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   82  177:pop             
		stringbuilder.append("\t");
	//   83  178:aload           9
	//   84  180:ldc1            #182 <String "\t">
	//   85  182:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   86  185:pop             
		stringbuilder.append(i);
	//   87  186:aload           9
	//   88  188:iload_2         
	//   89  189:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//   90  192:pop             
		stringbuilder.append("\t");
	//   91  193:aload           9
	//   92  195:ldc1            #182 <String "\t">
	//   93  197:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   94  200:pop             
		stringbuilder.append(s);
	//   95  201:aload           9
	//   96  203:aload           4
	//   97  205:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   98  208:pop             
		stringbuilder.append("\t");
	//   99  209:aload           9
	//  100  211:ldc1            #182 <String "\t">
	//  101  213:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  102  216:pop             
		stringbuilder.append(j);
	//  103  217:aload           9
	//  104  219:iload_3         
	//  105  220:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//  106  223:pop             
		stringbuilder.append("\t");
	//  107  224:aload           9
	//  108  226:ldc1            #182 <String "\t">
	//  109  228:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  110  231:pop             
		stringbuilder.append(s1);
	//  111  232:aload           9
	//  112  234:aload           5
	//  113  236:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  114  239:pop             
		stringbuilder.append("\t");
	//  115  240:aload           9
	//  116  242:ldc1            #182 <String "\t">
	//  117  244:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  118  247:pop             
		stringbuilder.append(s2);
	//  119  248:aload           9
	//  120  250:aload           6
	//  121  252:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  122  255:pop             
		stringbuilder.append("\t");
	//  123  256:aload           9
	//  124  258:ldc1            #182 <String "\t">
	//  125  260:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  126  263:pop             
		stringbuilder.append(f);
	//  127  264:aload           9
	//  128  266:fload_1         
	//  129  267:invokevirtual   #192 <Method StringBuilder StringBuilder.append(float)>
	//  130  270:pop             
		stringbuilder.append("\t");
	//  131  271:aload           9
	//  132  273:ldc1            #182 <String "\t">
	//  133  275:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  134  278:pop             
		stringbuilder.append(s3);
	//  135  279:aload           9
	//  136  281:aload           7
	//  137  283:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  138  286:pop             
		return stringbuilder.toString();
	//  139  287:aload           9
	//  140  289:invokevirtual   #195 <Method String StringBuilder.toString()>
	//  141  292:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private final long mTimeout;
	private final long zzfo;
	private int zzfp;
	private final String zzfq;
	private final String zzfr;
	private final String zzfs;
	private final int zzft;
	private final List zzfu;
	private final String zzfv;
	private final long zzfw;
	private int zzfx;
	private final String zzfy;
	private final float zzfz;
	private final int zzg;
	private long zzga;

	static 
	{
	//    0    0:new             #66  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void zza()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
