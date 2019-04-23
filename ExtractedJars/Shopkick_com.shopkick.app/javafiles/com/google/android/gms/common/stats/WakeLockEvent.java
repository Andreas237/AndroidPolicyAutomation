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
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #78  <Field int versionCode>
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
		durationMillis = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #91  <Long -1L>
	//   25   48:putfield        #94  <Field long durationMillis>
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
		zzga = l2;
	//   44   87:aload_0         
	//   45   88:lload           15
	//   46   90:putfield        #108 <Field long zzga>
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
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field int versionCode>
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
		SafeParcelWriter.writeLong(parcel, 16, zzga);
	//   68  126:aload_1         
	//   69  127:bipush          16
	//   70  129:aload_0         
	//   71  130:getfield        #108 <Field long zzga>
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

	public final long zzv()
	{
		return durationMillis;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long durationMillis>
	//    2    4:lreturn         
	}

	public final String zzw()
	{
		String s3 = zzfq;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzfq>
	//    2    4:astore          9
		int i = zzft;
	//    3    6:aload_0         
	//    4    7:getfield        #90  <Field int zzft>
	//    5   10:istore_2        
		Object obj = ((Object) (zzfu));
	//    6   11:aload_0         
	//    7   12:getfield        #96  <Field List zzfu>
	//    8   15:astore          4
		if(obj == null)
	//*   9   17:aload           4
	//*  10   19:ifnonnull       29
			obj = "";
	//   11   22:ldc1            #158 <String "">
	//   12   24:astore          4
		else
	//*  13   26:goto            38
			obj = ((Object) (TextUtils.join(",", ((Iterable) (obj)))));
	//   14   29:ldc1            #160 <String ",">
	//   15   31:aload           4
	//   16   33:invokestatic    #166 <Method String TextUtils.join(CharSequence, Iterable)>
	//   17   36:astore          4
		int j = zzfx;
	//   18   38:aload_0         
	//   19   39:getfield        #102 <Field int zzfx>
	//   20   42:istore_3        
		String s1 = zzfr;
	//   21   43:aload_0         
	//   22   44:getfield        #86  <Field String zzfr>
	//   23   47:astore          6
		String s = s1;
	//   24   49:aload           6
	//   25   51:astore          5
		if(s1 == null)
	//*  26   53:aload           6
	//*  27   55:ifnonnull       62
			s = "";
	//   28   58:ldc1            #158 <String "">
	//   29   60:astore          5
		String s2 = zzfy;
	//   30   62:aload_0         
	//   31   63:getfield        #104 <Field String zzfy>
	//   32   66:astore          7
		s1 = s2;
	//   33   68:aload           7
	//   34   70:astore          6
		if(s2 == null)
	//*  35   72:aload           7
	//*  36   74:ifnonnull       81
			s1 = "";
	//   37   77:ldc1            #158 <String "">
	//   38   79:astore          6
		float f = zzfz;
	//   39   81:aload_0         
	//   40   82:getfield        #106 <Field float zzfz>
	//   41   85:fstore_1        
		Object obj1 = ((Object) (zzfs));
	//   42   86:aload_0         
	//   43   87:getfield        #88  <Field String zzfs>
	//   44   90:astore          8
		s2 = ((String) (obj1));
	//   45   92:aload           8
	//   46   94:astore          7
		if(obj1 == null)
	//*  47   96:aload           8
	//*  48   98:ifnonnull       105
			s2 = "";
	//   49  101:ldc1            #158 <String "">
	//   50  103:astore          7
		obj1 = ((Object) (new StringBuilder(String.valueOf(((Object) (s3))).length() + 45 + String.valueOf(obj).length() + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length())));
	//   51  105:new             #168 <Class StringBuilder>
	//   52  108:dup             
	//   53  109:aload           9
	//   54  111:invokestatic    #174 <Method String String.valueOf(Object)>
	//   55  114:invokevirtual   #177 <Method int String.length()>
	//   56  117:bipush          45
	//   57  119:iadd            
	//   58  120:aload           4
	//   59  122:invokestatic    #174 <Method String String.valueOf(Object)>
	//   60  125:invokevirtual   #177 <Method int String.length()>
	//   61  128:iadd            
	//   62  129:aload           5
	//   63  131:invokestatic    #174 <Method String String.valueOf(Object)>
	//   64  134:invokevirtual   #177 <Method int String.length()>
	//   65  137:iadd            
	//   66  138:aload           6
	//   67  140:invokestatic    #174 <Method String String.valueOf(Object)>
	//   68  143:invokevirtual   #177 <Method int String.length()>
	//   69  146:iadd            
	//   70  147:aload           7
	//   71  149:invokestatic    #174 <Method String String.valueOf(Object)>
	//   72  152:invokevirtual   #177 <Method int String.length()>
	//   73  155:iadd            
	//   74  156:invokespecial   #180 <Method void StringBuilder(int)>
	//   75  159:astore          8
		((StringBuilder) (obj1)).append("\t");
	//   76  161:aload           8
	//   77  163:ldc1            #182 <String "\t">
	//   78  165:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   79  168:pop             
		((StringBuilder) (obj1)).append(s3);
	//   80  169:aload           8
	//   81  171:aload           9
	//   82  173:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   83  176:pop             
		((StringBuilder) (obj1)).append("\t");
	//   84  177:aload           8
	//   85  179:ldc1            #182 <String "\t">
	//   86  181:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   87  184:pop             
		((StringBuilder) (obj1)).append(i);
	//   88  185:aload           8
	//   89  187:iload_2         
	//   90  188:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//   91  191:pop             
		((StringBuilder) (obj1)).append("\t");
	//   92  192:aload           8
	//   93  194:ldc1            #182 <String "\t">
	//   94  196:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   95  199:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   96  200:aload           8
	//   97  202:aload           4
	//   98  204:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   99  207:pop             
		((StringBuilder) (obj1)).append("\t");
	//  100  208:aload           8
	//  101  210:ldc1            #182 <String "\t">
	//  102  212:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  103  215:pop             
		((StringBuilder) (obj1)).append(j);
	//  104  216:aload           8
	//  105  218:iload_3         
	//  106  219:invokevirtual   #189 <Method StringBuilder StringBuilder.append(int)>
	//  107  222:pop             
		((StringBuilder) (obj1)).append("\t");
	//  108  223:aload           8
	//  109  225:ldc1            #182 <String "\t">
	//  110  227:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  111  230:pop             
		((StringBuilder) (obj1)).append(s);
	//  112  231:aload           8
	//  113  233:aload           5
	//  114  235:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  115  238:pop             
		((StringBuilder) (obj1)).append("\t");
	//  116  239:aload           8
	//  117  241:ldc1            #182 <String "\t">
	//  118  243:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  119  246:pop             
		((StringBuilder) (obj1)).append(s1);
	//  120  247:aload           8
	//  121  249:aload           6
	//  122  251:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  123  254:pop             
		((StringBuilder) (obj1)).append("\t");
	//  124  255:aload           8
	//  125  257:ldc1            #182 <String "\t">
	//  126  259:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  127  262:pop             
		((StringBuilder) (obj1)).append(f);
	//  128  263:aload           8
	//  129  265:fload_1         
	//  130  266:invokevirtual   #192 <Method StringBuilder StringBuilder.append(float)>
	//  131  269:pop             
		((StringBuilder) (obj1)).append("\t");
	//  132  270:aload           8
	//  133  272:ldc1            #182 <String "\t">
	//  134  274:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  135  277:pop             
		((StringBuilder) (obj1)).append(s2);
	//  136  278:aload           8
	//  137  280:aload           7
	//  138  282:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  139  285:pop             
		return ((StringBuilder) (obj1)).toString();
	//  140  286:aload           8
	//  141  288:invokevirtual   #195 <Method String StringBuilder.toString()>
	//  142  291:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private long durationMillis;
	private final int versionCode;
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
	private final long zzga;

	static 
	{
	//    0    0:new             #66  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void zza()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
